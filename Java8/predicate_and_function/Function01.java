package predicate_and_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function01 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
		
		//function is a functional interface that that can reference a lambda expression or method reference 
		Function<Integer, Integer> square = num -> num * num;
		Function<Integer, Integer> squareVerbose = (num) -> {
			return num * num;
		};
		
		List<Integer> squares = new ArrayList<>();
		for (Integer number : numbers) {
			//square or squareVerbose are exactly the same 
			squares.add(square.apply(number));
		}
		System.out.println(squares);
	}
}
