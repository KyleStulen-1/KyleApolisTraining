package oops_12_overloading_constructors_with_super;

/**
 * Constructor Implementation : Constructor Overloading 
 * Initializing class level properties
 * @author Heeren
 * @version 1.0
 */

//The parent class is the java "object" class 
//super in this case, is auto-generated as part of the IDE constructing the class

public class Employee {
	private String ename;
	private float salary;
	private int age;

	public Employee(String ename, float salary, int age) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.age = age;
	}

	public Employee(String ename, int age) {
		super();
		this.ename = ename;
		this.age = age;
	}

	public Employee(String ename) {
		super();
		this.ename = ename;
	}

	public void printData() {
		System.out.println("Employee name is - " + ename);
		System.out.println("Employee salary is - " + salary);
		System.out.println("Employee age is - " + age);
	}

	public static void main(String[] args) {
		Employee employee1 = new Employee("John", 55000, 25);
		Employee employee2 = new Employee("Tom", 35000);
		Employee employee3 = new Employee("Minh");
		employee1.printData();
		employee2.printData();
		employee3.printData();

	}

}