package practiceProblems;

/*
 * Java Program to Print the Smallest Element in an Array
Write a Java program that takes an array as input and prints the smallest element in the array.

Input: An array, e.g., [3, 7, 1, 9, 5] Output: The smallest element is 1
 */
public class Problem05 {
	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		
		int[] inputArray = {3, 7, 1, 9, 5};
		
		for (int i = 0; i < inputArray.length; i++) {
			if (min > inputArray[i]) {
				min = inputArray[i];
			}
		}
		System.out.println("largest element: " + min);
	}
}
