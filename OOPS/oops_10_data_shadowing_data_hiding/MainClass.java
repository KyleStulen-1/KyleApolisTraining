/**
 * This class implements data hiding.
 * @author Heeren
 * @version 1.0
 */


package oops_10_data_shadowing_data_hiding;

//the practice of not giving variables unique names in tightly coupled code
//leading to increased difficulty in reading and understanding code 
//use super keyword to access parent class variable 

class Base{
	int x = 10;
}

class Child extends Base {
	int x = 20;
	void method() {
		int x = 30;
		System.out.println("Local variable : "+x);
		System.out.println("class level variable : "+ this.x); // data shadowing
		System.out.println("base class variable : "+ super.x); // data hiding 
	}
}

public class MainClass {
	public static void main(String[] args) {
		Child child = new Child();
		child.method();
	}
}