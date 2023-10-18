/**
 * Upcasting and downcasting
 * @author Heeren
 * @version 1.0
 */
package oops_18_TypeCasting;

class Parent {
	public void method() {
		System.out.println("method : Parent");
	}
}

class Child extends Parent {
	public void method() {
		System.out.println("method : Child");
	}
}

public class TypeCasting1 {
	public static void main(String args[]) {
		Child child = new Child();
		Parent parent = child; // upcasting
		parent.method();
		
		Child child1 = (Child) parent; // downcasting
		child1.method();
		
		//Explicit typecasting examples 
		double doubleValue = 123.45;
		int intValue = (int) doubleValue; // Explicit type casting
		System.out.println("Double value: " + doubleValue);
		System.out.println("Int value: " + intValue);

		char charValue = 'A';
		int unicode = (int) charValue; // Explicit type casting
		System.out.println("Char value: " + charValue);
		System.out.println("Unicode value: " + unicode);

	}
}