package predicate_and_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate02 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 7, 8, 10);

		Predicate<Integer> isEven = num -> num % 2 == 0;

		//https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#allMatch-java.util.function.Predicate-
		//for example, the allMatch method specifically takes a predicate 
		boolean allEven = numbers.stream().allMatch(isEven);

		if (allEven) {
			System.out.println("All numbers are even.");
		} else {
			System.out.println("Not all numbers are even.");
		}
	}
	
	

}
