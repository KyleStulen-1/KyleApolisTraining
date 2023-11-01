package default_and_static_methods;


// default methods enable you to add methods that accept lambda expressions as parameters to existing interfaces
// https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html#:~:text=Default%20methods%20enable%20you%20to%20add%20new%20functionality%20to%20existing,as%20parameters%20to%20existing%20interfaces.
interface Drawable {
	void draw(); // Abstract method

	default void drawDefault() {
		System.out.println("Default implementation: Drawing a shape.");
	}
}

class Circle implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a circle.");
	}
}

public class DefaultMethod01 {
	public static void main(String[] args) {
		Drawable circle = new Circle();
		circle.draw();
		//every object that implemented the interface can use the default method 
		circle.drawDefault();
	}
}