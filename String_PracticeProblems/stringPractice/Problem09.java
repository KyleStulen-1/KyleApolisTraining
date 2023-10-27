package stringPractice;

/*
 * Find the Longest Common Prefix Among a Group of Strings
Write a function that takes a list of strings as input and returns the longest common prefix among them.

Input: ["apple", "appetite", "apprehend"] Output: The longest common prefix - "app"
 */

public class Problem09 {
	
	static String longestCommonPrefix(String[] strings) {
		int shortestLength = Integer.MAX_VALUE;
		
		for (String s: strings) {
			if (s.length() < shortestLength) {
				shortestLength = s.length();
			}
		}
		
		int prefixLength = 1;
		for (;prefixLength < shortestLength-1; prefixLength++) {
			for (int j = 0; j < strings.length-1; j++) {
				if (! strings[j].substring(0, prefixLength).equals(strings[j+1].substring(0,prefixLength))) {
					break; 
				}
			}
		}
		
		return strings[0].substring(0, prefixLength-1);
	}
	
	public static void main(String[] args) {
		String[] input = {"apple", "appetite", "apprehend"};
		
		System.out.println(longestCommonPrefix(input));
		
		
	}
}
