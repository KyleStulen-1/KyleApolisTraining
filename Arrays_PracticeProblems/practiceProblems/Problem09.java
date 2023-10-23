package practiceProblems;

/*
 * Linear Search
Write a Java program that takes an array and a target element as input and performs linear search to find the index of the target element.

Input: An array, e.g., [3, 7, 1, 9, 5], and target element 7 Output: The index of 7 is 1
 */
public class Problem09 {
	public static void main(String[] args) {
		int[] inputArray = {3, 7, 1, 9, 5, 7};
		int target = 7; 
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == target) {
				System.out.println("The index of " + target + " is " + i);
				return; 
			}
		}
	}
}
