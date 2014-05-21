package com.exercise.pos;

import java.util.HashMap;

/**
 *	Database mockup. 
 */
public enum Data {

	PRODUCTS();
	
	private HashMap<String, Product> products;
	
	private Data() {
		products = new HashMap<String, Product>();
		
		String phone = "phone";
		products.put(phone, new Product(phone, 1000));
		
		String car = "car";
		products.put(car, new Product(car, 55000));
		
		String table = "table";
		products.put(table, new Product(table, 700));
	}
	
	public Product getProduct(String str) {
		Product product = null;
		if((product = products.get(str)) != null) {
			return product;
		} else {
			return null;
		}
	}
}
