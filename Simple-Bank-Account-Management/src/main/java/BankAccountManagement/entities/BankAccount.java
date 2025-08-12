package BankAccountManagement.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class BankAccount 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank(message = "Account number is required")
	@Column(name = "account_number", nullable = false, unique = true)
	private String accountNumber;
	
	@NotBlank(message = "Account holder name is required")
    @Column(name = "account_holder_name", nullable = false)
    private String accountHolderName;

    @Column(nullable = false)
    private BigDecimal balance;
    
    @NotBlank(message = "Account type is required")
    @Column(name = "account_type", nullable = false)
    private String accountType;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    
    public BankAccount()
    {
        this.createdAt = LocalDateTime.now();
        this.balance = BigDecimal.ZERO;
    }
    
    
    
	public BankAccount(Long id, String accountNumber, String accountHolderName, BigDecimal balance, String accountType,
			LocalDateTime createdAt) 
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
		this.createdAt = LocalDateTime.now();
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}  
}
