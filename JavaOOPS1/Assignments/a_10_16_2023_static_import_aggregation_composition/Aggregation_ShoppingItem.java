package a_10_16_2023_static_import_aggregation_composition;

import java.math.BigDecimal;

public class Aggregation_ShoppingItem {
	private String name;
	private BigDecimal price;
	
	public Aggregation_ShoppingItem(String name, BigDecimal price) {
		this.name = name; 
		this.price = price; 
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	
}
