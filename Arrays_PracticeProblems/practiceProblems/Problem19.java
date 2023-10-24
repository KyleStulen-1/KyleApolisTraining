package practiceProblems;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Remove Duplicates from an Array
Write a Java program that takes an array as input and removes duplicates.

Input: An array, e.g., [3, 2, 5, 2, 8, 5] Output: The array after removing duplicates: [3, 2, 5, 8]
 */

public class Problem19 {
	public static void main(String[] args) {
		Integer[] inputArray = {3, 2, 5, 2, 8, 5};
		
		//I don't think an unordered list can use a better algorithm that does not require implementing
		//'set like' implementation 
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(inputArray));
		
		System.out.println(set.toString());

	}
}
