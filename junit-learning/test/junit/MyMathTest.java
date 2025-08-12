package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest 
{
	private MyMath math = new MyMath();
	@Test
	void calculateSum_FourMemberArray() 
	{
		int result = math.calculateSum(new int[] {1,2,3,4});
		
		int expectedResult = 10;
		assertEquals(expectedResult, result);
		
		// Absence of failure is success.
		// Test Condition or Assert
	}

	// {} => 0
	@Test
	void calculateSum_ZeroLengthArray() 
	{
		int[] numbers = {};
		int result = math.calculateSum(numbers);
		
		int expectedResult = 0;
		assertEquals(expectedResult, result);
		
		// Absence of failure is success.
		// Test Condition or Assert
	}

}
