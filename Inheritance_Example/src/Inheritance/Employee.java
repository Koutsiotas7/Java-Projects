package Inheritance;

public class Employee extends Person
{
	private String title;
	private String employerName;
	private char employeeGrade;
	private double salary;
	
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getEmployerName() 
	{
		return employerName;
	}
	public void setEmployerName(String employerName) 
	{
		this.employerName = employerName;
	}
	public char getEmployeeGrade() 
	{
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) 
	{
		this.employeeGrade = employeeGrade;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	public String toString()
	{
		return super.toString() + " # " + title + " # " + employerName + " # " + employeeGrade;
	}
	
	
	
}