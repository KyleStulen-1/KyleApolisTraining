package exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling2 {
	public static void main(String args[]) {
		System.out.println("Enter first value");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println("Enter second value");
		int y = scanner.nextInt();
		//try to see, then print error if it divides by zero 
		try {
			double data = x / y;
			System.out.println("Result : " + data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}
}
