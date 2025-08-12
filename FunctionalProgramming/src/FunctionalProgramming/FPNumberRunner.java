package FunctionalProgramming;

import java.util.List;

public class FPNumberRunner 
{
	public static void main(String[] args)
	{
		
		List<Integer> numbers = List.of(4,6,8,13,3,15);
		numbers.stream().forEach(element->System.out.println(element));
		
		// int sum = normalSum(numbers);
		
		
		int sum = numbers.stream().reduce(0,(number1, number2)->number1 + number2);
		System.out.println("The sum is:" +sum);
		
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number:numbers)
		{
			sum = sum + number;
		}
		return sum;
	}
}