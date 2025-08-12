package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread 
{
	private int number;

	public Task(int number) {
		this.number = number;
	}

	public int getNumber() 
	{
		return number;
	}

	public void run()
	{
		System.out.println("\nTask " + number + " starts.");
		for (int i= number*100; i<=number*100+99; i++)
		{
			System.out.print(i + " ");
		}
		System.out.print("\nTask " + number + " is done.");
	}
}
public class ExecutorServiceRunner {

	public static void main(String[] args) 
	{
/*		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));
		
		System.out.println("Task 3 starts!");
		for (int i=101; i<=199; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("\nTask 3 is done!"); */
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		System.out.println("\nEverything is done!");
		
		executorService.shutdown();
	}

}
