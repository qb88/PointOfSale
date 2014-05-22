package com.exercise.pos;

import java.util.ArrayList;

import static com.exercise.pos.Data.PRODUCTS;

public class Transaction {

	private ArrayList<Product> shopping;
	private int prices;
	
	public Transaction() {
		shopping = new ArrayList<Product>();
	}

	public void finish() {
		shopping.clear();
		prices = 0;
	}
	
	public int getTotalCost() {
		return prices;
	}

	public String checkProduct(String in) {
		Product product = null;
		if((product = PRODUCTS.getProduct(in)) != null) {
			shopping.add(product);
			prices += product.getPrice();
			return product.toString();
		}
		return "Product not found";
	}

	public String getShopping() {
		StringBuilder sb = new StringBuilder();
		for(Product product : shopping) {
			sb.append(product.getName()).append(" ").append(product.getPrice()).append("\n");
		}
		return sb.toString();
	}
}
