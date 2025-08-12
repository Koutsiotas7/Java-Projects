package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest 
{
	List<String> todos = Arrays.asList("AWS","Azure", "DevOps");
	
	@Test
	void test() 
	{
		boolean test = todos.contains("AWS");
		boolean test2 = todos.contains("GCC");
		assertEquals(true, test);
		assertFalse(test2);
		
		assertEquals(3, todos.size(), "Error Message");
		
		assertTrue(test);	
		
		assertArrayEquals(new int[] {1,2}, new int[] {4,2});
	}

}
