package practiceProblems;

/*
 * Find Second Largest Number in an Array
Write a Java program that takes an array as input and finds the second largest number.

Input: An array, e.g., [3, 7, 1, 9, 5] Output: The second largest number is 7
 */
public class Problem14 {
	public static void main(String[] args) {
		int[] inputArray = {3, 7, 1, 9, 5};
		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] > secondLargestNumber) {
				secondLargestNumber = inputArray[i];
				if (secondLargestNumber > largestNumber) {
					int temp = largestNumber;
					largestNumber = secondLargestNumber;
					secondLargestNumber = temp;
				}
			}
		}
		
		System.out.println("The second largest number is: " + secondLargestNumber);
	}
}
