package stringPractice;

import java.util.HashMap;

/*
 * Print the First Non-Repeated Character in a String
Write a function that takes a string as input and prints the first non-repeated character in the string.

Input: A string, e.g., "hello" Output: The first non-repeated character, e.g., "h"
 */

public class Problem14 {
	
	static String firstNonRepeatCharacter(String s) {
		HashMap<Character, Integer> occurences = new HashMap<Character, Integer>();
		
		for(char c: s.toCharArray()) {
			if (occurences.containsKey(c)) {
				occurences.replace(c, occurences.get(c) + 1);
			} else {
				occurences.put(c, 1);
			}
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (occurences.get(s.charAt(i)) == 1) {
				
				return s.substring(i, i+1);
			}
		}
		return "No non-repeated character";
		
	}
	
	public static void main(String[] args) {
		System.out.println(firstNonRepeatCharacter("hello"));
		System.out.println(firstNonRepeatCharacter("jumping"));
		System.out.println(firstNonRepeatCharacter("waterwate"));
	}
	
}
