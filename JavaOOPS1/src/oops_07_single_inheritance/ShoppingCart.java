package oops_07_single_inheritance;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ShoppingCart {
	
	ArrayList<ShoppingItem> cart;
	
	public ShoppingCart() {
		cart = new ArrayList<ShoppingItem>();
	}
	
	private void add(ShoppingItem shoppingItem) {
		cart.add(shoppingItem);		
	}
	
	private BigDecimal totalPrice() {
		return cart.stream().map(cartItem -> cartItem.getPrice()).reduce(new BigDecimal(0.0), BigDecimal::add);
	}
	
	public static void main(String args[]) {
		ShoppingCart cart = new ShoppingCart();
		cart.add(new ShoppingItem("milk", new BigDecimal(4.00)));
		cart.add(new ShoppingItem("Cheese", new BigDecimal(3.50)));
		
		System.out.println("The total price is: " + cart.totalPrice());
	}




}
