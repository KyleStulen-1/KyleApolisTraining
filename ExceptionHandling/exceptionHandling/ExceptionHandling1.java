package exceptionHandling;

/**
 * possible use cases where exceptions occurs.
 * @author Heeren
 * @version 1.0
 */

import java.util.Scanner;

//examples of 4 exceptions
public class ExceptionHandling1 {

	public static void main(String args[]) {
		System.out.println("Enter first value");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println("Enter second value");
		int y = scanner.nextInt();
		//DivideByZeroException
		double data = x / y;
		System.out.println("Result : " + data);
		System.out.println("rest of the code...");
		
		//NullPointerException 
		String s = null; 
		System.out.println(s.length());
		  
		//NumberFormatException 
		String s2="hello"; 
		int i=Integer.parseInt(s);
		  
		//ArrayIndexOutOfBoundsException 
		int a[]=new int[5]; 
		a[10]=50;
		  
		 
	}
}
