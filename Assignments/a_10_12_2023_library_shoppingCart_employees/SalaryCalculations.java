package a_10_12_2023_library_shoppingCart_employees;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SalaryCalculations {
	
	private ArrayList<SalaryEmployee> employees;
	
	public SalaryCalculations() {
		employees = new ArrayList<SalaryEmployee>();
	}
	
	public void addEmployee(SalaryEmployee employee) {
		employees.add(employee);
	}
	
	public void print_employees_postTaxSalaries() {
		employees.stream().map(e -> e.name + "'s post tax salary is: " + e.postTaxSalary).forEach(System.out::println);
	}
	
	public static void main(String args[]) {
		SalaryCalculations salaryCalculator = new SalaryCalculations();
		salaryCalculator.addEmployee(new SalaryEmployee("Jim", new BigDecimal("50000.00")));
		salaryCalculator.addEmployee(new SalaryEmployee("Kevin", new BigDecimal("55234.21")));
		
		salaryCalculator.print_employees_postTaxSalaries();
		
		
	}
}
