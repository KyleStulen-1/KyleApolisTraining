/**
 * Implementation of local variable and Data shadowing
 * @author Heeren
 * @version 1.0
 */

//data shadowing is what happens when you don't give unique names to local and class variables 
//in the same scope
//don't do this outside of setters as it makes code harder to read and understand 

package oops_05_data_shadowing;
class CustomClass {
	int x = 10;

	public void display() {
		int x = 20;
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] a) {
		CustomClass customClass = new CustomClass();
		customClass.display();
	}
}