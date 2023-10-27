package stringPractice;

import java.util.HashMap;
import java.util.Map;

/*
 * Print All Duplicate Characters in a String
Write a function that takes a string as input and prints all the duplicate characters present in the string.

Input: "programming" Output: r, g, m
 */

public class Problem15 {
	
	static String findDuplicates(String s) {
		HashMap<Character, Integer> occurences = new HashMap<Character, Integer>();
		
		for(char c: s.toCharArray()) {
			if (occurences.containsKey(c)) {
				occurences.replace(c, occurences.get(c) + 1);
			} else {
				occurences.put(c, 1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (Map.Entry<Character, Integer> entry : occurences.entrySet()) {
			if (entry.getValue() > 1) {
				sb.append(entry.getKey());
			}
		}
		
		return String.join(", ", sb.toString().split(""));
	}
	
	public static void main(String[] args) {
		String input = "programming";
		System.out.println("Duplicate letters in " + input + " are: " + findDuplicates(input));
	}


}
