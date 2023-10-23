package practiceProblems;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Find Missing Number in the Array
Write a Java program that takes an array as input and finds the missing number in the sequence.

Input: An array, e.g., [1, 2, 3, 4, 6, 7, 8, 9] Output: The missing number is 5
 */

public class Problem13 {
	public static void main(String[] args) {
		//creates list of missing integers between the lowest and highest values in an array of integers
		
		int[] inputArray = {3, 7, 1, 9, 5};
		ArrayList<Integer >missingNumbers = new ArrayList<Integer>();
		Arrays.sort(inputArray);
		
		
		int index = 0; 
		for (int i = inputArray[0]; i <= inputArray[inputArray.length-1]; i++) {
			if (i == inputArray[index]) {
				index++;
			} else {
				missingNumbers.add(i);
			}
		}
		System.out.println(missingNumbers.toString());
	}
	
}
