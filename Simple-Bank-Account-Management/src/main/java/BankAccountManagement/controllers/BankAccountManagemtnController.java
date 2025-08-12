package BankAccountManagement.controllers;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import BankAccountManagement.entities.BankAccount;
import BankAccountManagement.repositories.*;

@Controller
@RequestMapping("/NewBank")
public class BankAccountManagemtnController 
{
	@Autowired
	private BankAccountManagementRepository bankAccountRepository;
	
	@GetMapping
	public String listAccounts(Model model)
	{	
		List<BankAccount> accounts = bankAccountRepository.findAll();
		model.addAttribute("accounts", accounts);
		return "NewBank/list";
	}
	
	@GetMapping("/newAccount")
	public String createForm(Model model)
	{
		model.addAttribute("bankAccount", new BankAccount());
		return "NewBank/create";
	}
	
	@PostMapping
    public String createAccount(@ModelAttribute("bankAccount") BankAccount bankAccount) 
	{
        // Set initial balance if null
        if (bankAccount.getBalance() == null) 
        {
            bankAccount.setBalance(BigDecimal.ZERO);
        }
        bankAccountRepository.save(bankAccount);
        return "redirect:/NewBank";
    }
	
	@GetMapping("/edit/{id}")
	public String EditForm(@PathVariable("id") Long id, Model model)
	{
		BankAccount bankAccount = bankAccountRepository.findById(id)
				.orElseThrow(()->new IllegalArgumentException("Invalid id." +id));
		model.addAttribute("bankAccount", bankAccount);
		return "NewBank/edit";
	}
	
	 @PostMapping("/update/{id}")
	    public String updateAccount(@PathVariable("id") Long id, @ModelAttribute("bankAccount") BankAccount bankAccount) {
	        BankAccount existingAccount = bankAccountRepository.findById(id)
	                .orElseThrow(() -> new IllegalArgumentException("Invalid account Id:" + id));

	        existingAccount.setAccountNumber(bankAccount.getAccountNumber());
	        existingAccount.setAccountHolderName(bankAccount.getAccountHolderName());
	        existingAccount.setBalance(bankAccount.getBalance());
	        existingAccount.setAccountType(bankAccount.getAccountType());

	        bankAccountRepository.save(existingAccount);
	        return "redirect:/NewBank";
	    }
	 
	    @GetMapping("/delete/{id}")
	    public String deleteAccount(@PathVariable("id") Long id) 
	    {
	        BankAccount bankAccount = bankAccountRepository.findById(id)
	                .orElseThrow(() -> new IllegalArgumentException("Invalid account Id:" + id));
	        bankAccountRepository.delete(bankAccount);
	        return "redirect:/NewBank";
	    }
}
