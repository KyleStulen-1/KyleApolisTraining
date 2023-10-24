package practiceProblems;

import java.util.ArrayList;

/*
 * Separate Odd and Even Numbers in an Array
Write a Java program that takes an array as input and separates odd and even numbers.

Input: An array, e.g., [1, 2, 3, 4, 5, 6, 7, 8, 9] Output: Odd numbers: [1, 3, 5, 7, 9], Even numbers: [2, 4, 6, 8]
 */

public class Problem15 {
	public static void main(String[] args) {
		int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] % 2 == 0) {
				evenNumbers.add(inputArray[i]);
			} else {
				oddNumbers.add(inputArray[i]);
			}
		}
		
		System.out.println("Even numbers " + evenNumbers.toString());
		System.out.println("Odd numbers " + oddNumbers.toString());
	}
}
