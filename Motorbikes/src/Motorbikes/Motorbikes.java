package Motorbikes;

public class Motorbikes
{
	private String name;
	private double max_velocity;
	public Motorbikes(String name, double max_velocity)
	{
		this.name = name;
		this.max_velocity = max_velocity;
	}
	
	public String getName() 
	{
        return this.name;
    }
	
	public void start() 
	{
		System.out.println("The " + name + " begins.");
	}
	
	public double get_Mvelocity()
	{
		return this.max_velocity;
	}
	
	public double getdistance(double time)
	{	
		return this.get_Mvelocity() * (time / 3600);
	}
	
	public boolean isFasterThan(Motorbikes otherBike) 
	{
        return this.max_velocity > otherBike.max_velocity;
    }
}