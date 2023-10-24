package practiceProblems;

/*
 * Find the Maximum Difference Between Two Elements in an Array
Write a Java program that takes an array as input and finds the maximum difference between two elements.

Input: An array, e.g., [4, 2, 10, 8, 7] Output: The maximum difference is 8
 */

public class Problem17 {
	public static void main(String[] args) {
		int[] inputArray = {4, 2, 10, 8, 7};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] < min) {
				min = inputArray[i];
			} else if (inputArray[i] > max) {
				max = inputArray[i];
			}
		}
		
		System.out.println("The maximum difference is: " + (max - min));
	}
}
