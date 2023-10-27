package stringPractice;

/*
 * Check if Two Strings are Anagrams
Write a function that takes two strings as input and returns True if they are anagrams of each other, and False otherwise.

Input: "listen" and "silent" Output: Entered strings are anagrams.

Input: "hello" and "world" Output: Entered strings are not anagrams.
 */

public class Problem07 {
	
	static boolean isAnagram(String s1, String s2) {
		int[] count = new int[256];
		if (s1.length() != s2.length()) {
			return false;
		}
		for (int i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for (int i: count) {
			if (i != 0) {
				return false;
			}
		}
		
		return true;
	}
	
	static void printAnagramMessage(String s1, String s2) {
		if (isAnagram(s1,s2)) {
			System.out.println(s1 + " and " + s2 + " are anagrams.");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams.");
		}
	}
	
	public static void main(String[] args) {
		printAnagramMessage("listen", "silent");
		printAnagramMessage("hello", "world");
	}
}
