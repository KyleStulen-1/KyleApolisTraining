package oops_17_Abstract_Class;

public class Car extends Vehicle{
	
	public Car() {
		super();
	}

	@Override
	public void drive() {
		if (!engineOn) {
			System.out.println("car is not started");
			return; 
		}
		if (forward) {
			distanceTraveled += 1;
		} else {
			distanceTraveled -= 1;
		}
		
	}
	
	@Override
	public void toggleForward() {
		forward = !forward;
		
	}
	
	@Override
	public void toggleIgnition() {
		engineOn = !engineOn;
	}
	
	public static void main(String args[]) {
		Car car = new Car();
		car.toggleIgnition();
		car.drive();
		car.drive();
		System.out.println("Car has traveled: " + car.distanceTraveled);
	}
	
}
