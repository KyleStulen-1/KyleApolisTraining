package optional;

import java.util.Optional;

public class Optional03 {
	public static void main(String[] args) {
		Optional<Integer> optionalNumber = Optional.ofNullable(getNumber());
		Optional<Integer> filtered = optionalNumber.filter(n -> n > 0);

		//use opetional method isPresent() to see if it is null or not
		
		if (filtered.isPresent()) {
			System.out.println("Positive Number: " + filtered.get());
		} else {
			System.out.println("Not a positive number");
		}
	}

	public static Integer getNumber() {
		// Simulate a method that might return null
		return -5;
	}
}
