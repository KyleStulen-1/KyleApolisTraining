package a_10_12_2023_library_shoppingCart_employees;

import java.math.BigDecimal;

public class SalaryEmployee {
	
	String name;
	BigDecimal salary;
	static BigDecimal takeHomePercentage = new BigDecimal(0.90);
	BigDecimal postTaxSalary;
	
	public SalaryEmployee(String name, BigDecimal salary) {
		this.name = name;
		this.salary = salary;
		this.postTaxSalary = salary.multiply(takeHomePercentage).setScale(2, BigDecimal.ROUND_UP);
	}
}
