package oops_20_nested_classes;

interface Base {
	void interfaceMethod();
}

class OuterClass11 {
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
	
	class InstanceInnerClass11 {
		private int y = 30;
		//Instance nested classes can access both static and instance variables 
		void showInstance() {
			System.out.println(x);
			System.out.println(y);
		}
		
		//TODO: according to documentation in oops nested class nestclass5.java this is not allowed
		// to have static method in instance inner class
		static void display() {
			//instance variables cannot be accessed in static methods 
			//int temp = this.y
			
			System.out.println("Instance nested class : static display() method called"); 

		}
		
		void displayY_Values() {
			System.out.println("local variable y: " + y);
			//data hiding
			System.out.println("Instance variable y: " + this.y + " in nested instance class");
			//data shadowing
			System.out.println("Instance variable y: " + OuterClass11.this.y + " in outer class");
		}
	}
	
	public void methodWithClassInside() {
		int localVariable = 100;
		class LocalInner {
			void display() {
				//local class cannot change the local variable in the same scope it was defined
				//localVariable = 200;
				System.out.println("local inner class in instance method");
				System.out.println("instance variable x from outer class: " + x);
				System.out.println("static variable y from outer class: " + y);
				System.out.println("local inner class accessing local variable in method: " + localVariable);
			}
		}
		LocalInner localInner = new LocalInner();
		localInner.display();
	}
	public static void static_methodWithClassInside() {
		class LocalInner {
			void display () {
				System.out.println("local inner class in static method");
				System.out.println("variable x from outer class: " + x);
				//static method cannot acccess instance variable y 
				// System.out.println(y);
			}
		}
		LocalInner localInner = new LocalInner();
		localInner.display();
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
public class Nest11 {
	public static void main(String args[]) {
		//static method call
		OuterClass11.StaticInnerClass.showStatic();
		//instance methods can of course not be called statically 
		//OuterClass3.StaticInnerClass.display();
		
		OuterClass11.StaticInnerClass innerStatic = new OuterClass11.StaticInnerClass();
		//should not do this, call static methods statically
		innerStatic.showStatic();
		//instance method called on an instance 
		innerStatic.displayStatic();
		
		OuterClass11.InstanceInnerClass11 innerInstance = new OuterClass11().new InstanceInnerClass11();
		innerInstance.showInstance();
		innerInstance.display();
		innerInstance.displayY_Values();
		
		OuterClass11 outerClass = new OuterClass11();
		outerClass.methodWithClassInside();
		OuterClass11.static_methodWithClassInside();
		
		Base base = new Base() {
			public void interfaceMethod() {
				System.out.println("Implementation of : interfaceMethod()");
			}
		};
		base.interfaceMethod();

	}	
}
