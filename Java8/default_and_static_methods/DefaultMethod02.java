package default_and_static_methods;

import java.util.ArrayList;
import java.util.List;

public class DefaultMethod02 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		names.add("David");

		// Using the forEach default method to print each name
		// forEach is a default method in the Iterable interface that Collection implments
		// https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html
		names.forEach(name -> System.out.println("Hello, " + name));
	}
}
