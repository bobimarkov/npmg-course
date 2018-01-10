package store.controller;

import java.util.Arrays;

import store.entity.MeasuringUnits;
import store.entity.Product;
import store.entity.ProductManager;
import store.entity.Role;

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
		int indexFound = Arrays.binarySearch(products, new Product(id));
		if(indexFound < 0) return null;
		return products[indexFound];
	}
	
	public static void main(String[] args) {
		Product[] products = {
				new Product("DVD R/W",5.90,50,"LG", MeasuringUnits.UNIT),
				new Product("Wireless Mouse",24.5,20,"Logitech", MeasuringUnits.UNIT),
				new Product("NVIDIA GEFORCE GTX1080 TI",1250,100,"EVGA", MeasuringUnits.UNIT)
		};

		
		ProductManager pm1 = new ProductManager("ipetrov","ipetrov@gmail.com","Ivan","Petrov","parola",Role.CUSTOMER);
		for(Product p: products)pm1.addProduct(p);
		System.out.println(pm1);
	}

}
