package a_10_12_2023_library_shoppingCart_employees;

import java.math.BigDecimal;

public class ShoppingItem {
	private String name;
	private BigDecimal price;
	
	public ShoppingItem(String name, BigDecimal price) {
		this.name = name; 
		this.price = price; 
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	
}
