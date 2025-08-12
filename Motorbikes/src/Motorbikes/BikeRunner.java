package Motorbikes;

public class BikeRunner
{
	public static void main (String[] args) 
	{
		Motorbikes m1 = new Motorbikes("Suzuki", 315);
		Motorbikes m2 = new Motorbikes("Yamaha", 320);
		Motorbikes m3 = new Motorbikes("Honda", 305);
		
		m1.start();
		m2.start();
		m3.start();
		
		double v1,v2,v3;
		double d1,d2,d3;
	
		v1 = m1.get_Mvelocity();
		v2 = m2.get_Mvelocity();
		v3 = m3.get_Mvelocity();
		
		System.out.println("The m1 motorbike runs with "+ v1 + " km/h.");
		System.out.println("The m2 motorbike runs with "+ v2 + " km/h.");
		System.out.println("The m3 motorbike runs with "+ v3 + " km/h.");
        
		d1 = m1.getdistance(25);
		d2 = m2.getdistance(7);
		d3 = m3.getdistance(22);
		
		if (d1 > d2 && d1 > d3)
		{
			System.out.println("The motorbike "+ m1.getName() + " travelled the most.");
		}
		else if (d2 > d1 && d2 > d3)
		{
			System.out.println("The motorbike "+ m2.getName() + " travelled the most.");
		}
		else 
		{
			System.out.println("The motorbike "+ m3.getName() + " travelled the most.");
		}
		
		System.out.println("The motorbike m1 has covered "+ d1 + " kilometres.");
		System.out.println("The motorbike m2 has covered "+ d2 + " kilometres.");
		System.out.println("The motorbike m3 has covered "+ d3 + " kilometres.");
        
		if (m1.isFasterThan(m2)) 
		{
            System.out.println(m1.getName() + " is faster than " + m2.getName() + ".");
        } 
		else 
		{
            System.out.println(m1.getName() + " is not faster than " + m2.getName() + ".");
        }
		
		if (m1.isFasterThan(m3)) 
		{
            System.out.println(m1.getName() + " is faster than " + m3.getName() + ".");
        } 
		else 
		{
            System.out.println(m1.getName() + " is not faster than " + m3.getName() + ".");
        }
	}
}