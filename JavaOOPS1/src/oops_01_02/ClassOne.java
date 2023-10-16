package oops_01_02;

import java.util.concurrent.atomic.AtomicInteger;

public class ClassOne {
	
	private int x;
	private static int y = 15;
	private static AtomicInteger countInstantiated = new AtomicInteger(0);
	
	{
		countInstantiated.incrementAndGet();
	}
	public ClassOne(int x) {
		this.x = x;
		
	}
	
	protected void finalize() {
		countInstantiated.decrementAndGet();
	}
	
	public void setX (int x) {
		this.x = x;
	}
	
	public static void display_countInstantiated() {
		System.out.println("There are " + countInstantiated.get() + " instantiated objects of ClassOne");
	}
	

	public static void main(String[] args) {
		ClassOne firstObject = new ClassOne(10);
		ClassOne secondObject = new ClassOne(10);
		ClassOne thirdObject = new ClassOne(10);
		System.out.println("First Object: " + firstObject.x);
		System.out.println("Second Object: " + secondObject.x);
		ClassOne.display_countInstantiated();
		System.out.println("Third Object: " + thirdObject.x);
		ClassOne.display_countInstantiated();
		
		System.out.println("access static variable: " + ClassOne.y);
		
		secondObject.setX(20);
		thirdObject.setX(y); 
		
		System.out.println("First Object: " + firstObject.x);
		System.out.println("Second Object: " + secondObject.x);
		System.out.println("Third Object: " + thirdObject.x);

	}

}
