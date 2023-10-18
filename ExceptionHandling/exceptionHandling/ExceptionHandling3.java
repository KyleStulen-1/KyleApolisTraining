package exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String args[]) {
		System.out.println("Enter first value");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println("Enter second value");
		int y = scanner.nextInt();
		try {
			double data = x / y;
			int i = 3;
			double array[] = new double[5];
			array[i] = data;
			System.out.println("Result : " + data);
		}
		
		//multiple exception can be caught as long as child exceptions come before their parents
		
		  catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}
}