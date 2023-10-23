package practiceProblems;

/*
 * Binary Search
Write a Java program that takes a sorted array and a target element as input and performs binary search to find the index of the target element.

Input: A sorted array, e.g., [1, 3, 5, 7, 9], and target element 5 Output: The index of 5 is 2
 */

public class Problem10 {
	public static void main(String[] args) {
		int[] inputArray = {1, 3, 5, 7, 9, 11, 13, 15, 17};
		int target = 5;
		int targetIndex = -1;
		
		int low = 0;
		int high = inputArray.length-1;
		int mid = -1;
		while(low <= high) {
			mid = (low + high) / 2;
			if (target > inputArray[mid]  ) {
				low = mid + 1;
			} else if (target < inputArray[mid]) {
				high = mid - 1;
			} else {
				targetIndex = mid;
				break;
			}
		}
		
		if (targetIndex < 0) {
			System.out.println("target value of " + target + " not found in the array.");
			return;
		}
		System.out.println("The index of " + target + " is " + mid);
	}
}
