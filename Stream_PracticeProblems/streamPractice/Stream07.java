package streamPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * Find the maximum and minimum values in an array
Input: int[] numbers = {10, 20, 5, 15, 30}
Output: Max: 30, Min: 5
 */
public class Stream07 {
	public static <T> void main(String[] args) {
		int[] numbers = {10, 20, 5, 15, 30};
		
		IntStream stream = Arrays.stream(numbers);
		System.out.println(stream.max());
		stream = Arrays.stream(numbers);
		System.out.println(stream.min());
		
	}
}
