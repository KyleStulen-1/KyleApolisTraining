package stringPractice;

/*
 * Reverse a String
Write a function that takes a string as input and returns the reverse of that string.

Input: "hello" Output: "olleh"
 */

public class Problem01 {
	public static void main(String[] args) {
		String input = "hello";
		String output = "";
		
		for (int i = 0; i < input.length(); i++) {
			System.out.println("letter: " + input.substring(input.length() - i - 1, input.length() - i));
			
			output.concat(input.substring(input.length() - i - 1, input.length() - i));
			
			//output = output + input.substring(input.length() - i - 1, input.length() - i);
		}
		
		System.out.println("output: " + output);
	}
}
