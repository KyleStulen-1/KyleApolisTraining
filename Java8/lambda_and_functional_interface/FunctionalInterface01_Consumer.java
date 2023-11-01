package lambda_and_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterface01_Consumer {
	//A consumer takes an input, performs some action with the input, returns nothing. 
	
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(List.of(1,2,3,5,8,13,21));
		
		Consumer<Integer> printNumber = (num) -> {
			System.out.println("Number: " + num);
		};
		
		//on each number, pass number to printNumber.accept(Integer);
		numbers.forEach(printNumber);
		
		printNumber.accept(1234567890);
	}
}
	
