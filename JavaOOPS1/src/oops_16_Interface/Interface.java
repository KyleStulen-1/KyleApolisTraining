package oops_16_Interface;

interface shape {
	double area();
}

class Square implements shape {
	private double width = 4;
	private long height = 4; 
	
	@Override
	public double area() {
		return width * height;
	}
}

class Circle implements shape {
	private double radius = 2;

	@Override
	public double area() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
}

public class Interface {

	public static void main(String[] args) {
		System.out.println("square area: " + new Square().area());
		System.out.println("circle area: " + new Circle().area());
	}
}
