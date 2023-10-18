package oops_15_pass_by_reference;

/**
 * Call by reference 
 * @author Heeren
 * @version 1.0
 */

class Employee {
	private String ename;
	private String age;
	private int salary;

	public void setEmployeeData(String ename, String age, int salary) {
		this.ename = ename;
		this.age = age;
		this.salary = salary;
	}

	public void setEmployeeData(Employee employee) {
		this.ename = employee.ename;
		this.age = employee.age;
		this.salary = employee.salary;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", age=" + age + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Employee employee1 = new Employee(); 
		//the ("Tom","25",2555) are three distinct values passed to the method 
		employee1.setEmployeeData("Tom","25",2555);   // call by value
		System.out.println(employee1);
		Employee employee2 = new Employee();
		//employee1 variable is the reference to the object that variable points to 
		//the reference or container of the object is passed to the method, not the object itself 
		employee2.setEmployeeData(employee1);  //call by reference 
		System.out.println(employee2);
	}
}
