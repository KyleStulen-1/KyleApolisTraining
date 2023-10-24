package practiceProblems;

import java.util.Arrays;

/*
 * Find the kth Smallest Element in an Array
Write a Java program that takes an array and an integer k as input and finds the kth smallest element.

Input: An array, e.g., [4, 2, 10, 8, 7], and k = 3 Output: The 3rd smallest element is 7
 */

public class Problem18 {
	public static void main(String[] args) {
		int[] inputArray = {4, 2, 10, 8, 7};
		int k = 3;
		
		//simplest implementation: Arrays.sort
		//O(n*log(n))
		//reference: https://www.geeksforgeeks.org/kth-smallest-largest-element-in-unsorted-array/
		//priority queue for large values of n and low k looks preferred 
		
		Arrays.sort(inputArray);
		
		System.out.println("The " + k + "'th smallest element is " + inputArray[k-1]);
		
		
		
	}
}
