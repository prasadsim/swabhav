package com.techlabs.model;

import java.util.*;

public class ShoppingCart {
List<Item> items;
	
	public ShoppingCart(){
		this.items=new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public int calculateTotal(){
		int sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(IPaymentStrategy paymentMethod){
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}
