package Charcounter;

import java.util.Map;
import java.util.HashMap;

public class MapCharRunner 
{
	public static void main (String[] args)
	{
		String str = "This is very nice." + "This is perfect";
		
		Map<Character, Integer> counters = new HashMap<>();
		
		char[] chars = str.toCharArray();
		for(char character:chars)
		{
			Integer integer = counters.get(character);
			if(integer == null)
			{
				counters.put(character, 1);
			}
			else
			{
				counters.put(character, integer + 1);
			}
		}
		
		System.out.println(counters);
	}
}
