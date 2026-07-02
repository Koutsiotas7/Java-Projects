package bankSystem.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String accountId;
	private double balance;
	private String holderName;
	private List<Transaction> transactions = new ArrayList<>();
	
	public Account()
	{
		
	}
	
	public Account(String accountId, String holderName) 
	{
		this.accountId = accountId;
		this.balance = 0.0;
		this.holderName = holderName;
	}

	public String getAccountId() 
	{
		return accountId;
	}

	public double getBalance() 
	{
		return balance;
	}

	public String getHolderName() 
	{
		return holderName;
	}
	
	public void deposit(double amount)
	{
		if(amount <= 0)
		{
			throw new IllegalArgumentException("You must enter a positive value!");
		}
		
		balance += amount;
		
		transactions.add(new Transaction(Type.DEPOSIT, amount, "Deposited to account " + amount + "€"));
	}
	
	public void withdraw(double amount)
	{
		if(amount <=0)
		{
			throw new IllegalArgumentException("You must enter an amount greater than 0!");
		}
		
		if(amount > balance)
		{
			throw new IllegalArgumentException("Not enough money in the bank!!");
		}
		
		balance -= amount;
		
		transactions.add(new Transaction(Type.WITHDRAW, amount, "Withdrawn from account " + amount + "€"));
	}

	@Override
	public String toString() 
	{
		return "Account [accountId=" + accountId + ", balance=" + balance + "€" + 
						", holderName=" + holderName + "]";
	}
	
	public List<Transaction> getTransactions()
	{
		return Collections.unmodifiableList(transactions); //Read-only
	}
	
	public void addTransaction(Transaction transaction)
	{
		transactions.add(transaction);
	}

}
