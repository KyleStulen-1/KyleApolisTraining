package stringPractice;

/*
 * Remove Duplicates from a String
Write a function that takes a string as input and removes all the duplicate characters, returning the modified string.

Input: "aabbcdd" Output: "abcd"
 */

public class Problem04 {
	public static void main(String[] args) {
		String input = "aabbbbbbbccccccdddddddaaabbbcccddd";
		StringBuilder sb = new StringBuilder(input);
		
		for (int i = 0; i < sb.length(); i ++) {
			for (int j = i+1; j < sb.length(); j++) {
				if (sb.charAt(i) == sb.charAt(j)) {
					sb.deleteCharAt(j);
					j--;
				}
			}
		}
		
		System.out.println(sb.toString());
	}
}
