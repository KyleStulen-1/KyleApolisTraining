package practiceProblems;

/*
 * Find the Subarray with the Maximum Sum
Write a Java program that takes an array as input and finds the subarray with the maximum sum.

Input: An array, e.g., [-2, 1, -3, 4, -1, 2, 1, -5, 4] Output: The subarray with the maximum sum: [4, -1, 2, 1]
 */

public class Problem22 {
	public static void main(String[] args) {
		int[] inputArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int currentSum = 0;
		int maximumSum = Integer.MIN_VALUE; 
		
		for (int i = 0; i < inputArray.length; i++) {
			currentSum += inputArray[i];

			if (currentSum > maximumSum) {
				maximumSum = currentSum;
			}
			if (currentSum < 0) {
				currentSum = 0; 
			}
		}
		
		System.out.println("The sum of the maximum subarray is: " + maximumSum);
	}
	
	
}
