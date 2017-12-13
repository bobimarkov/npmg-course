package store.controller;

import java.util.Arrays;
import store.entity.Product;

public class ProductController {
	public static final int MAX_PRODUCTS = 1000;
	private Product[] products;
	private int size = 0;
	
	public ProductController() {
		products = new Product[MAX_PRODUCTS];
	}
	
	public ProductController(int capacity) {
		products = new Product[capacity];
	}
	
	public Product findById(long id) {
		Arrays.binarySearch(a, key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
