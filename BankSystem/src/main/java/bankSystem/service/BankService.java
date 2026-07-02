package bankSystem.service;

import java.util.HashMap;
import java.util.Map;

import bankSystem.model.Account;
import bankSystem.model.Transaction;
import bankSystem.model.Type;

public class BankService 
{
	private Map<String, Account> accounts = new HashMap<>();
	private StorageService storage = new StorageService();
	
	public BankService()
	{
		this.accounts = storage.load();
	}
	
	private void save() 
	{
        storage.save(accounts);
    }
	
	public void deposit(String id, double amount) 
	{
	    Account acc = getAccount(id);
	    acc.deposit(amount);
	    save();
	}
	
	public void withdraw(String id, double amount) 
	{
	    Account acc = getAccount(id);
	    acc.withdraw(amount);
	    save();
	}
	
	public Account createAccount(String accountId, String holderName)
	{
		if(accounts.containsKey(accountId))
		{
			throw new IllegalArgumentException("This account already exists!!");
		}
		
		Account account = new Account(accountId, holderName);
		accounts.put(accountId, account);
		
		save();
		return account;
	}
	
	public Account getAccount(String accountId)
	{
		Account account = accounts.get(accountId);
		
		if(account == null)
		{
			throw new IllegalArgumentException("This account was not found!");
		}
		
		return account;
	}
	
	public void transfer(String fromAccountId, String toAccountId, double amount)
	{
		if (amount <= 0) 
		{
	        throw new IllegalArgumentException("Transfer amount must be greater than 0");
	    }
		
		if (fromAccountId.equals(toAccountId)) 
		{
	        throw new IllegalArgumentException("Cannot transfer to the same account");
	    }
		
		Account fromAccount = getAccount(fromAccountId);
	    Account toAccount = getAccount(toAccountId);
	    
	    fromAccount.withdraw(amount);
	    
	    toAccount.deposit(amount);
	    
	    fromAccount.addTransaction(
	    	    new Transaction(
	    	        Type.TRANSFER,
	    	        amount,
	    	        "Transferred from " + fromAccountId + " to " + toAccountId + " " + amount + "€"
	    	    )
	    	);
	    
	    toAccount.addTransaction(
	    	    new Transaction(
	    	        Type.TRANSFER,
	    	        amount,
	    	        "Received from " + fromAccountId + " " + amount + "€"
	    	    )
	    	);
	    
	    save();
	    
	}
}
