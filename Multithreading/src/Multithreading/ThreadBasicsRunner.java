package Multithreading;


class Task1 extends Thread
{
	public void run()
	{
		System.out.println("\nTask 1 starts!");
		for (int i=101; i<=199; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("\nTask 1 is done!");
	}
}

class Task2 implements Runnable 
{

	@Override
	public void run() 
	{
		System.out.println("\nTask 2 starts!");
		for (int i=201; i<=299; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("\nTask 2 is done.");
	}
	
}

public class ThreadBasicsRunner 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.print("\nTask 1 kicks off!");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();
		
		
		System.out.print("\nTask 2 kicks off!");
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.setPriority(10);
		task2thread.start();
		
		// wait for task1 completed
		task1.join();
		task2thread.join();
		
		System.out.println("Task 3 starts!");
		for (int i=101; i<=199; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("\nTask 3 is done!");
		
		System.out.println("\nEverything is done!");
		
		
	}
}