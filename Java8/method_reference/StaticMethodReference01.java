package method_reference;

import java.util.function.Function;
import java.util.stream.Stream;

@FunctionalInterface
interface MySquareFunction {
	int square(int n);
}

public class StaticMethodReference01 {
	public static void main(String[] args) {
		//What here is communicating with the square method on line 7?
		//Is there a more verbose way of writing this to explain more?
		//this is the static reference to the class::method
		MySquareFunction squareFunction = StaticMethodReference01::calculateSquare;
		
		//Function interface cannot use primitives will autobox them
		Function<Integer, Integer> otherSquareFunction = StaticMethodReference01::calculateSquare;

		int result = squareFunction.square(5);
		System.out.println("Square: " + result);
		
		int result2 = otherSquareFunction.apply(6);
		System.out.println("Square2: " + result2);
		
		/////////////////////////////////////////////
		
		int input = 7;
		Stream.of(input).map((num) -> {
			return num * num;
		}).forEach(System.out::println);
		Stream.of(input).map(otherSquareFunction).forEach(System.out::println);
		//but doesn't like
		//Stream.of(input).map(squareFunction).forEach(System.out::println);
	}

	public static int calculateSquare(int n) {
		return n * n;
	}
}
