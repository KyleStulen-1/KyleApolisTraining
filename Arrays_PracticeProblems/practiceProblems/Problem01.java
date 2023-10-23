package practiceProblems;

/*
 * Java Program to Find the Frequency of Each Element in an Array
Write a Java program that takes an array as input and prints the frequency of each element in the array.

Input: An array, e.g., [1, 2, 2, 3, 1, 4, 5] Output: Element 1 occurs 2 times, Element 2 occurs 2 times, Element 3 occurs 1 time, Element 4 occurs 1 time, Element 5 occurs 1 time
 */
public class Problem01 {
	public static void main(String[] args) {
		//better implementation would be to create a map for this prompt, 
		//but this is array exercises
		int max = Integer.MIN_VALUE;
		
		int[] inputArray = {1, 2, 2, 3, 1, 4, 5};
		
		for (int i = 0; i < inputArray.length; i++) {
			if (max < inputArray[i]) {
				max = inputArray[i];
			}
		}
		
		int[] frequencies = new int[max+1];
		for (int i = 0; i < inputArray.length; i++) {
			frequencies[inputArray[i]]++;
		}
		
		for (int i = 0; i < frequencies.length; i++) {
			System.out.println("Element " + i + " occurs " + frequencies[i] + " times");
		}
	}

}
