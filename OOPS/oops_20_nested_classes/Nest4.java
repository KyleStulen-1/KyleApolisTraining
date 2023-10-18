package oops_20_nested_classes;

class OuterClass4 {
	static int x = 10;
	int y = 20;
	
	static class StaticInnerClass {
		static void showStatic() {
			System.out.println(x);
			
			//static nested classes can only access static variables 
			//System.out.println(y);
			
			System.out.println("Static nested class : static show() method called");
		}
		
		//static nested classes can have static and instance class members (methods)
		void displayStatic() {
			System.out.println("Static nested class : instance display() method called");
		}
	}
	
	class InstanceInnerClass4 {
		//Instance inner classes can access both static and instance variables 
		void showInstance() {
			System.out.println(x);
			System.out.println(y);
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
public class Nest4 {
	public static void main(String args[]) {
		//static method call
		OuterClass4.StaticInnerClass.showStatic();
		//instance methods can of course not be called statically 
		//OuterClass3.StaticInnerClass.display();
		
		OuterClass4.StaticInnerClass innerStatic = new OuterClass4.StaticInnerClass();
		//should not do this, call static methods statically
		innerStatic.showStatic();
		//instance method called on an instance 
		innerStatic.displayStatic();
		
		OuterClass4.InstanceInnerClass4 innerInstance = new OuterClass4().new InstanceInnerClass4();
		innerInstance.showInstance();
		
	}
	
	
}
