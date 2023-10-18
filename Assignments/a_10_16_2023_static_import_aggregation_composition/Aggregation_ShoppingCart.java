package a_10_16_2023_static_import_aggregation_composition;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Aggregation_ShoppingCart {
	
	ArrayList<Aggregation_ShoppingItem> cart;
	
	public Aggregation_ShoppingCart() {
		cart = new ArrayList<Aggregation_ShoppingItem>();
	}
	
	private void add(Aggregation_ShoppingItem shoppingItem) {
		cart.add(shoppingItem);		
	}
	
	private BigDecimal totalPrice() {
		return cart.stream().map(cartItem -> cartItem.getPrice()).reduce(new BigDecimal("0.0"), BigDecimal::add);
	}
	
	public static void main(String args[]) {
		
		//ShoppingCart "HAS-A" ShoppingItem 
		//the shopping item can exist on its own because it is stored in its own variables
		//this is aggregation because the items are not deleted when the cart is deleted 
		
		Aggregation_ShoppingCart cart = new Aggregation_ShoppingCart();
		Aggregation_ShoppingItem milk = new Aggregation_ShoppingItem("milk", new BigDecimal("4.00"));
		Aggregation_ShoppingItem cheese = new Aggregation_ShoppingItem("Cheese", new BigDecimal("3.50"));
		cart.add(milk);
		cart.add(cheese);
		
		System.out.println("The total price is: " + cart.totalPrice());
	}




}
