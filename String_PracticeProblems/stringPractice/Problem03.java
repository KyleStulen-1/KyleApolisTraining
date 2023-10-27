package stringPractice;

/*
 * Check if a String is a Palindrome
Write a function that takes a string as input and returns True if it is a palindrome (reads the same forwards and backwards), and otherwise returns False.

Input: "radar" Output: Entered string is palindrome.

Input: "hello" Output: Entered string is not a palindrome.
 */
public class Problem03 {
	
	static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length()/2; i ++) {
			if ( ! s.substring(i, i+1).equals(s.substring(s.length()-i -1, s.length()-i))) {
				return false;
			}
		}
		return true;
	}
	
	static void printPalindromeMessage(String s) {
		if (isPalindrome(s)) {
			System.out.println(s + " is a palindrome.");
		} else {
			System.out.println(s + " is not a palindrome.");
		}
	}
	
	public static void main(String[] args) {
		String input1 = "radar";
		String input2 = "hello";
		
		printPalindromeMessage(input1);
		printPalindromeMessage(input2);
		
	}
}
