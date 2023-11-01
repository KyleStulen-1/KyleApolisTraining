package lambda_and_functional_interface;

import java.util.Random;
import java.util.function.Supplier;

public class FunctionalInterface02_Supplier {
	//A supplier does not take an input, can have a product
	//must return a value
	
	public static void main(String[] args) {
		Supplier<Integer> numberSupplier = () -> {
			Random random = new Random();
			return random.nextInt(10);
		};
		
		System.out.println("Random number 0-9: " + numberSupplier.get());
	}
}
