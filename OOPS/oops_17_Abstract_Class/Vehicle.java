package oops_17_Abstract_Class;

abstract class Vehicle implements Ignition {
	boolean forward;
	boolean engineOn;
	double distanceTraveled;
	
	public Vehicle() {
		forward = true;
		engineOn = false; 
		distanceTraveled = 0;
	}
	
	
	public abstract void drive();
	public abstract void toggleForward();
}
