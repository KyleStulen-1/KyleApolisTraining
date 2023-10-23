package practiceProblems;

/*
 * Java Program to Print the Sum of All the Items of the Array
Write a Java program that takes an array as input and prints the sum of all the items in the array.

Input: An array, e.g., [3, 7, 1, 9, 5] Output: The sum of all items is 25
 */

public class Problem07 {
	public static void main(String[] args) {
		int[] inputArray = {3, 7, 1, 9, 5};
		int sum = 0; 
		
		for (int i = 0; i < inputArray.length; i++) {
			sum += inputArray[i];
		}
		
		System.out.println("sum: " + sum);
		
	}
}
