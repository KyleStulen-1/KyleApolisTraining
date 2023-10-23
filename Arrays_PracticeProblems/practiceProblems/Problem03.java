package practiceProblems;

/*
 * Java Program to Print the Elements of an Array Present on Even Positions
Write a Java program that takes an array as input and prints the elements of the array present on even positions.

Input: An array, e.g., [3, 7, 1, 9, 5] Output: 7, 9
 */

public class Problem03 {
	public static void main(String[] args) {
		int[] inputArray = {3, 7, 1, 9, 5};
		
		for (int i = 0; i < inputArray.length; i++) {
			if (i % 2 == 1) {
				System.out.print(inputArray[i] + ", ");
			}
		}
	}
}
