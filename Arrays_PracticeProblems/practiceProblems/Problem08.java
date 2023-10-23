package practiceProblems;

import java.util.Arrays;

/*
 * Java Program to Copy All Elements of One Array into Another Array
Write a Java program that takes two arrays as input and copies all elements of the first array into the second array.

Input: Two arrays, e.g., [3, 7, 1, 9, 5] and [0, 0, 0, 0, 0] Output: The second array after copying: [3, 7, 1, 9, 5]
 */

public class Problem08 {
	public static void main(String[] args) {
		int[] inputArray = {3, 7, 1, 9, 5};
		int[] secondArray = inputArray.clone();
		
		System.out.println("copied array: " + Arrays.toString(secondArray));
	}
	

}
