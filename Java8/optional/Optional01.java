package optional;

import java.util.Optional;

public class Optional01 {
	public static void main(String[] args) {
		Optional<String> optionalName = Optional.ofNullable(getName());
		String name = optionalName.orElse("Unknown");
		System.out.println("Name: " + name);
	}

	public static String getName() {
		// This method might return null
		return "John";
	}
}
