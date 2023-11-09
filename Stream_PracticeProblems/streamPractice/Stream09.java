package streamPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Check if all elements in a list satisfy a given condition
Input: List numbers = [10, 20, 30, 40, 50]
Condition: Each number is greater than 5 Output: true
 */
public class Stream09 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		
		boolean stream = list.stream().allMatch(num -> num > 5);
		
		
		System.out.println(stream);
		
	}

}
