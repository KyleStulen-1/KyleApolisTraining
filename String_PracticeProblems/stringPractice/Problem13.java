package stringPractice;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * Reverse Each Word of a String in a Sentence
Write a function that takes a sentence as input and reverses each word in the sentence.

Input: "hello world" Output: "olleh dlrow"
 */

public class Problem13 {
	public static void main(String[] args) {
		String input = "hello world";
		String[] words = input.split(" ");
		
	
		StringBuilder sb = new StringBuilder();
		
		String output = 
		Arrays.asList(words).stream().map(s -> {
			sb.setLength(0);
			sb.append(s);
			sb.reverse();
			return sb.toString();
		}).collect(Collectors.joining(" "));
		
		System.out.println(output);
	}
}
