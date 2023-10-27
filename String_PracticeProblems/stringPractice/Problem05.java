package stringPractice;

/*
 * 5: Capitalize the First Letter of Each Word in a Sentence
Write a function that takes a sentence as input and capitalizes the first letter of each word.

Input: "this is a sample sentence" Output: "This Is A Sample Sentence"
 */

public class Problem05 {
	public static void main(String[] args) {
		String input = "this is a sample sentence";
		
		String[] words = input.split(" ");
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
		}
		String output = String.join(" ", words);
		
		
		System.out.println("output: " + output);
	}
}
