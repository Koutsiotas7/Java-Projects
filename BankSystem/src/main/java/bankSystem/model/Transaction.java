package bankSystem.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Transaction implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private Type type;
	private double amount;
	private LocalDateTime timestamp;
	private String details;
	
	public Transaction()
	{
		
	}
	
	public Transaction(Type type, double amount, String details) 
	{
		this.type = type;
		this.amount = amount;
		this.details = details;
		this.timestamp = LocalDateTime.now();
	}

	public Type getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getDetails() {
		return details;
	}

	@Override
	public String toString() 
	{
		return "Transaction [type=" + type + ", amount=" + amount + "€" + 
				", timestamp=" + timestamp + ", details=" + details
				+ "]";
	}
	
}
