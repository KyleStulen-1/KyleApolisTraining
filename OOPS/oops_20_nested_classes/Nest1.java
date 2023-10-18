package oops_20_nested_classes;

class OuterClass {
	static int x = 10;
	static class StaticInnerClass {
		static void show() {
			System.out.println("Static nested class : show() method called");
		}
	}
}

/**docs.oracle.com
	"Nested class: Use it if your requirements are similar to those of a local class,
	you want to make the type more widely available, 
	and you don't require access to local variables or method parameters."
	
	Use a non-static nested class (or inner class) if you require access to 
	an enclosing instance's non-public fields and methods. 
	Use a static nested class if you don't require this access.
**/
public class Nest1 {
	public static void main(String args[]) {
		//static method call
		OuterClass.StaticInnerClass.show();
		
		OuterClass.StaticInnerClass innerStatic = new OuterClass.StaticInnerClass();
		//should not do this, call static methods statically
		innerStatic.show();
	}
	
	
}
