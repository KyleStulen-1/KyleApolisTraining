package predicate_and_function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Predicate01 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Ella");
		
		
		Predicate<String> startsWithC = name -> name.startsWith("C");
		Function<String, Boolean> startsWithCFunction = name -> name.startsWith("C");
		
		//while the above code is the same
		//the predicate interface comes with methods and(), or(), negate() that work naturally with boolean logic 
		//the predicate also returns a primitive boolean 
		//while the Function must return an object Boolean
		
		names.stream().filter(startsWithC).forEach(System.out::println);
	}
}
