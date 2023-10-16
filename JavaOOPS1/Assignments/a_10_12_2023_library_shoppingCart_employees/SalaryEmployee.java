package a_10_12_2023_library_shoppingCart_employees;

import java.math.BigDecimal;

public class SalaryEmployee {
	
	protected String name;
	protected BigDecimal salary;
	protected static BigDecimal takeHomePercentage = new BigDecimal("0.90");
	protected BigDecimal postTaxSalary;
	
	public SalaryEmployee(String name, BigDecimal salary) {
		this.name = name;
		this.salary = salary;
		this.postTaxSalary = salary.multiply(takeHomePercentage);
	}
}
