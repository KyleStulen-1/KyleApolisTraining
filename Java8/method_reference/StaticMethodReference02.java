package method_reference;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReference02 {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
		
		//use the static method reference for Integer.parseInt()
		numbers.stream().map(Integer::parseInt).forEach(System.out::println);
	}
}