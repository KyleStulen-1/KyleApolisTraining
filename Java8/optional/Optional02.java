package optional;

import java.util.Optional;

public class Optional02 {
	public static void main(String[] args) {
		Optional<String> maybeName = Optional.ofNullable(getName());
		String result = maybeName.map(String::toUpperCase).orElse("No name provided");
		System.out.println("Result: " + result);
	}

	public static String getName() {
		// Simulate a method that might return null
		return "Alice";
	}
}
