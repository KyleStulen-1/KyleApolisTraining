package oops_07_single_inheritance;

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
