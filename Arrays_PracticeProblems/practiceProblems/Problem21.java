package practiceProblems;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Find the Union of Two Arrays
Write a Java program that takes two arrays as input and finds their union.

Input: Two arrays, e.g., [3, 2, 5, 8], and [5, 7, 9] Output: The union of arrays: [3, 2, 5, 8, 7, 9]
 */

public class Problem21 {
	public static void main(String[] args) {
		Integer[] array1 = {3,2,5,8};
		Integer[] array2 = {5,2,9,10,11};
		
		HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(array1));
		set.addAll(Arrays.asList(array2));
		
		System.out.println("union: " + set.toString());
	}
}
