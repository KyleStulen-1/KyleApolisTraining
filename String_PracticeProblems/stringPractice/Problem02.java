package stringPractice;

import java.util.HashMap;

/*
 * Count the Occurrences of a Character
Write a function that takes a string and returns the number of occurrences of each character in the string.

Input: "hello" Output: h - 1 times, e - 1 times, l - 2 times, o - 1 times
 */

public class Problem02 {
	public static void main(String[] args) {
		String input = "hello";
		char[] charA = input.toCharArray();
		
		HashMap<Character, Integer> occurences = new HashMap<Character, Integer>();
		
		for(char c: charA) {
			if (occurences.containsKey(c)) {
				occurences.replace(c, occurences.get(c) + 1);
			} else {
				occurences.put(c, 1);
			}
		}
		
		System.out.println("letters occured this many times in thie string");
		System.out.println(occurences.toString() );
	}
}
