package collectionsPractice;

import java.util.HashSet;

/*
 * Create an Employee class with attributes:

	int employeeId: A unique employee ID for each employee.
		String name: The name of the employee.
		String department: The department in which the employee works.
		double salary: The salary of the employee.
	**Override the equals() and hashCode() methods in the Employee class to ensure that employee objects are considered equal if their employeeId attributes are the same.
	
	Implement a Main class with a main() method where you:
		Instantiate a HashSet of Employee objects.
		Create several Employee instances and add them to the HashSet.
		Demonstrate the use of the HashSet by finding, removing, and checking for the existence of employees.
		Display the number of employees in the `HashSet.
 */

public class Problem06 {
	public static void main(String[] args) {
		HashSet<Problem06_Employee> employees = new HashSet<Problem06_Employee>();
		Problem06_Employee e1 = new Problem06_Employee(1,"jack","cleaning", 10000);
		Problem06_Employee e2 = new Problem06_Employee(2,"mike","cleaning", 10000);
		Problem06_Employee e3 = new Problem06_Employee(3,"angela","cleaning", 10000);
		Problem06_Employee e4 = new Problem06_Employee(4,"michelle","IT", 15000);
		Problem06_Employee e5 = new Problem06_Employee(5,"bob","IT", 14000);
		Problem06_Employee e6 = new Problem06_Employee(6,"marley","IT", 14500);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		
		System.out.println(employees.size());
		System.out.println(employees.toString());
		
		employees.remove(e2);
		employees.remove(e4);
		employees.remove(e6);
		
		System.out.println(employees.size());
		System.out.println(employees.toString());
		
	}
}
