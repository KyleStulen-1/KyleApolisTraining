package stringPractice;

/*
 * Count the Occurrences of a Specific Character in a String
Write a function that takes a string and a character as input and returns the number of occurrences of that character in the string.

Input: "hello world" and a character (e.g., "o") Output: 'o' occurred 2 times in the entered string.
 */

public class Problem06 {
	public static void main(String[] args) {
		String input = "hello world";
		String targetLetter = "o";
		int countTarget = 0;
		
		input = input.toLowerCase();		
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i+1).equals(targetLetter)) {
				countTarget++;
			}
		}
		
		System.out.println(targetLetter + " seen " + countTarget + " times");
	}
}
