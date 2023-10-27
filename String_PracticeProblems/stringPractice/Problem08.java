package stringPractice;

/*
 * Remove All Whitespace Characters from a String
Write a function that takes a string as input and removes all the whitespace characters, returning the modified string.

Input: "hello world" Output: "helloworld"
 */

public class Problem08 {
	
	public static void main(String[] args) {
		String input = "This Is An Example Sentance";
		
		String output = input.replaceAll(" ", "");
		
		System.out.println(output);
	}
}
