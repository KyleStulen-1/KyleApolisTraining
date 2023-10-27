package stringPractice;

/*
 * Swapping Two Strings Without Using a Third Variable
Write a function that takes two strings as input and swaps their values without using a third variable.

Input: "hello" and "world" Output: Strings swapped, so the first string becomes "world" and the second string becomes "hello".
 */

public class Problem11 {
	public static void main(String[] args) {
		//goal: concatenate then seperate at proper position; 
		String s1 = "hello"; 
		String s2 = "world";
		
		s2 = s1 + s2;
		s1 = s2.substring(s1.length());
		s2 = s2.substring(0, s1.length());
		
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
	}
}
