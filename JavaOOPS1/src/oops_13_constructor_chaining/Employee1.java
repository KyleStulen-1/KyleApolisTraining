package oops_13_constructor_chaining;

public class Employee1 {
	private String ename;
	private float salary;
	private int age;

	public Employee1(String ename, float salary, int age) {
		this.ename = ename;
		this.salary = salary;
		this.age = age;
	}

	
	public Employee1(String ename, int age) {
		//code here calls the constructor that matches the parameters sent, deciding with overloaded constructors
		this(25000);
		//
		this.ename = ename;
		this.age = age;
	}

	public Employee1(float salary) {
		this.salary = salary;
	}

	public void printData() {
		System.out.println("Employee name is - " + ename);
		System.out.println("Employee salary is - " + salary);
		System.out.println("Employee age is - " + age);
	}

	public static void main(String[] args) {
		Employee1 employee = new Employee1("Minh", 25);
		employee.printData();

	}

}
