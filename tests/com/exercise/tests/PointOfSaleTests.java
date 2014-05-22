package com.exercise.tests;
import static org.junit.Assert.*;

import org.junit.Test;

import com.exercise.pos.Data;
import com.exercise.pos.Product;
import com.exercise.pos.Transaction;

public class PointOfSaleTests {

	final String name = "productName";
	final int price = 123;
	
	// data obtained from Data enum
	final String car = "car";
	final int carPrice = 55000;
	
	@Test
	public void DataTest() {
		Product product = Data.PRODUCTS.getProduct(name);
		assertNull(product);
		
		product = Data.PRODUCTS.getProduct(car);
		assertNotNull(product);
	}
	
	@Test
	public void ProductTests() {
		Product product = new Product(name, price);
		
		assertEquals(name, product.getName());
		assertEquals(price, product.getPrice());
		assertEquals(name + " " + price, product.toString());
	}
	
	@Test
	public void TransactionTests() {
		Transaction transaction = new Transaction();
		assertEquals(0, transaction.getTotalCost());
		
		transaction.checkProduct(name);
		assertEquals(0, transaction.getTotalCost());
		
		transaction.checkProduct(null);
		assertEquals(0, transaction.getTotalCost());
		
		transaction.checkProduct(car);
		assertEquals(carPrice, transaction.getTotalCost());
		assertEquals(car + " " + carPrice + "\n", transaction.getShopping());
		
		transaction.finish();
		assertEquals(0, transaction.getTotalCost());
		assertEquals("", transaction.getShopping());
	}
}
