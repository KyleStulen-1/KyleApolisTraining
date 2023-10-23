package practiceProblems;

/*
 * Java Program to Print the Largest Element in an Array
Write a Java program that takes an array as input and prints the largest element in the array.

Input: An array, e.g., [3, 7, 1, 9, 5] Output: The largest element is 9
 */
public class Problem04 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		
		int[] inputArray = {3, 7, 1, 9, 5};
		
		for (int i = 0; i < inputArray.length; i++) {
			if (max < inputArray[i]) {
				max = inputArray[i];
			}
		}
		System.out.println("largest element: " + max);
	}
}
