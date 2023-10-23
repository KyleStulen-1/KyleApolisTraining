package practiceProblems;

/*
 * Java Program to Print the Elements of an Array in Reverse Order
Write a Java program that takes an array as input and prints its elements in reverse order.

Input: An array, e.g., [3, 7, 1, 9, 5] Output: 5, 9, 1, 7, 3
 */

public class Problem02 {

	public static void main(String[] args) {
		int[] inputArray = {3, 7, 1, 9, 5};
		
		for(int i = inputArray.length-1; i >= 0; i--) {
			System.out.print(inputArray[i] + ", ");
		}

	}

}
