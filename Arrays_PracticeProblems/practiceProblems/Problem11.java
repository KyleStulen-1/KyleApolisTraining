package practiceProblems;

import java.util.Arrays;

/*
 * Selection Sorting
Write a Java program that takes an array as input and performs selection sorting on its elements.

Input: An array, e.g., [3, 7, 1, 9, 5] Output: The sorted array: [1, 3, 5, 7, 9]
 */

public class Problem11 {
	public static void main(String[] args) {
		int[] inputArray = {3, 7, 1, 9, 5};
		for (int i = 0; i < inputArray.length; i++) {
			int min = Integer.MAX_VALUE;
			int minLocation = -1;
			for (int j = i; j < inputArray.length; j++) {
				if (inputArray[j] < min) {
					min = inputArray[j];
					minLocation = j;
				}
			}
			int temp = inputArray[i];
			inputArray[i] = inputArray[minLocation];
			inputArray[minLocation] = temp;
		}
		System.out.println("sorted array: " + Arrays.toString(inputArray));
	}
}
