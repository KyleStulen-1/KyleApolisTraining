package practiceProblems;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Find the Intersection of Two Arrays
Write a Java program that takes two arrays as input and finds their intersection.

Input: Two arrays, e.g., [3, 2, 5, 8], and [5, 2, 9] Output: The intersection of arrays: [2, 5]
 */

public class Problem20 {
	public static void main(String[] args) {
		//
		Integer[] array1 = {3,2,5,8};
		Integer[] array2 = {5,2,9,10,11};
		
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(array1));
		set.retainAll(Arrays.asList(array2));
		
		System.out.println("The intersection of arrays: " + set.toString());
	}
}
