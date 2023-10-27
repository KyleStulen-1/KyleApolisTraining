package collectionsPractice;

import java.util.Objects;

public class Problem06_Employee {
	private int employeeID;
	private String name;
	private String department;
	private double salary;
	
	public Problem06_Employee(int id, String name, String department, int salary) {
		this.employeeID = id;
		this.name = name;
		this.department = department;
		this.salary = salary; 
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Problem06_Employee other = (Problem06_Employee) obj;
		return Objects.equals(department, other.department) && employeeID == other.employeeID
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "Problem06_Employee [employeeID=" + employeeID + ", name=" + name + ", department=" + department
				+ ", salary=" + salary + "]";
	} 
	
	
	
	
	
}
