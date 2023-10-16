package a_10_16_2023_static_import_aggregation_composition;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Composition_ShoppingCart {
	
	ArrayList<Composition_ShoppingItem> cart;
	
	public Composition_ShoppingCart() {
		cart = new ArrayList<Composition_ShoppingItem>();
	}
	
	private void add(Composition_ShoppingItem shoppingItem) {
		cart.add(shoppingItem);		
	}
	
	private BigDecimal totalPrice() {
		return cart.stream().map(cartItem -> cartItem.getPrice()).reduce(new BigDecimal("0.0"), BigDecimal::add);
	}
	
	public static void main(String args[]) {
		
		//ShoppingCart "HAS-A" ShoppingItem 
		//the shopping item can not exist on its own because it is stored and created in the ShoppingCart object
		//this is composition because the cart items are deleted if the cart is deleted 
		
		Composition_ShoppingCart cart = new Composition_ShoppingCart();
		cart.add(new Composition_ShoppingItem("milk", new BigDecimal("4.00")));
		cart.add(new Composition_ShoppingItem("Cheese", new BigDecimal("3.50")));
		
		System.out.println("The total price is: " + cart.totalPrice());
	}




}
