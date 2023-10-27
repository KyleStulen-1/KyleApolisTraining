package stringPractice;

/*
 * Print the Largest Word in a String Sentence
Write a function that takes a sentence as input and prints the largest word in the sentence.

Input: "This is a sample sentence" Output: The largest word - "sentence"
 */

public class Problem16 {
	public static void main(String[] args) {
		String s1 = "This is a sample sentence";
		String[] words = s1.split(" ");
		
		String longestWord = "";
		int longestLength = 0;
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > longestLength) {
				longestLength = words[i].length();
				longestWord = words[i];
			}
		}
		
		System.out.println("The longest word in the sentence is: " + longestWord);
	}
}
