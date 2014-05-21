package com.exercise.pos;

public class Product {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.setName(name);
		this.setPrice(price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.price;
	}
}
