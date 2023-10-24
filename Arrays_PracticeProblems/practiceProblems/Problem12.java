package practiceProblems;

import java.util.Arrays;

/*
 * Bubble Sorting
Write a Java program that takes an array as input and performs bubble sorting on its elements.

Input: An array, e.g., [3, 7, 1, 9, 5] Output: The sorted array: [1, 3, 5, 7, 9]
 */

public class Problem12 {
	public static void main(String[] args) {
		int[] inputArray = {3, 7, 1, 9, 5};
		
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 1; j < inputArray.length - i; j++) {
				if (inputArray[j-1] > inputArray[j]) {
					int temp = inputArray[j-1];
					inputArray[j-1] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(inputArray));
	}
}
