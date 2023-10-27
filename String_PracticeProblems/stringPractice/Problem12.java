package stringPractice;

/*
 * Check if a String is a Rotation of Another String
Write a function that takes two strings as input and returns True if one string is a rotation of the other string, and False otherwise.

Input: "apple" and "leapp" Output: True (since "leapp" is a rotation of "apple")

Input: "hello" and "world" Output: False (since "world" is not a rotation of "hello")
 */

public class Problem12 {
	public static void main(String[] args) {
		//looks like doing this efficiently is enormously complex
		//relevant string search algorithm here: https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_string-search_algorithm
		//just going to append and trust java is using a good algorithm
		
		String s1 = "apple";
		String s2 = "leapp";
		
		s1 = s1 + s1;
		
		if (s1.contains(s2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}
}
