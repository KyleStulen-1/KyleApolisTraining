package streamPractice;

import java.util.Arrays;

public class Stream10 {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int output = Arrays.stream(nums).filter(num -> num%2==0).reduce(1, (product, num) -> product * num);
		
		System.out.println(output);
	}
}
