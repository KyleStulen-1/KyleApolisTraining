package practiceProblems;

/*
 * Find Peak Element in the Array
Write a Java program that takes an array as input and finds the peak element.

Input: An array, e.g., [1, 3, 5, 2, 4, 6, 8] Output: The peak element is 5
 */

// reference: https://leetcode.com/problems/find-peak-element/solutions/ possible log(n) binary search solution
// problem should tell me what a peak element is

public class Problem16 {
	public static void main(String[] args) {
		int[] inputArray = {1, 3, 5, 2, 4, 6, 8};
		
		for (int i = 1; i < inputArray.length-1; i++) {
			if (inputArray[i-1] < inputArray[i] && inputArray[i] > inputArray[i+1]) {
				System.out.println("A peak element is at index: " + i);
			}
		}
	}
}
