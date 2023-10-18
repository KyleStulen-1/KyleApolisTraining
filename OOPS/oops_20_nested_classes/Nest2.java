package oops_20_nested_classes;

class OuterClass2 {
	static int x = 10;
	int y = 20;
	
	static class StaticInnerClass {
		static void show() {
			System.out.println(x);
			
			//static inner classes can only access static variables 
			//System.out.println(y);
			
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
public class Nest2 {
	public static void main(String args[]) {
		//static method call
		OuterClass2.StaticInnerClass.show();
		
		OuterClass2.StaticInnerClass innerStatic = new OuterClass2.StaticInnerClass();
		//should not do this, call static methods statically
		innerStatic.show();
	}
	
	
}
