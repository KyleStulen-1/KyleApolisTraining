package streamPractice;

import java.util.Arrays;

/*
 * Find the sum of all odd numbers in an array
Input: int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}
Output: 1 + 3 + 5 + 7 + 9 = 25
 */
public class Stream01 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int sum1 = Arrays.stream(nums).filter(num -> num % 2 == 1).sum();
		
		int sum2 = Arrays.stream(nums).filter(num -> num % 2 == 1).reduce(0, (sum, num) -> sum + num);
		
		System.out.println(sum1);
		System.out.println(sum2);
		
	}
}
