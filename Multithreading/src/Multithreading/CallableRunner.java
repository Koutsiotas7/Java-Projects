package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable
{
	private String name;
	
	public CallableTask(String name)
	{
		this.name = name;
	}
	
	@Override
	public String call() throws Exception 
	{
		Thread.sleep(1000);
		return "Hello " + name;
	}
	
}
public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> welFuture = executorService.submit(new CallableTask("In 28 minutes."));
		
		System.out.print("\n New CallableTask(\"In 28 minutes.\")executed.");
		String welcome = welFuture.get();
		System.out.print(welcome);
		System.out.print("\nMain completed!");
	}

}
