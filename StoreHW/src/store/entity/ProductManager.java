package store.entity;

import java.util.Arrays;

public class ProductManager extends User {
	public static final int MAX_PRODUCTS = 100;
	
	private Product[] mangedProducts = new Product[MAX_PRODUCTS];
	private int numProducts = 0;
	
	public Product[] getProducts() {
		return Arrays.copyOf(mangedProducts, numProducts);
	}
	
	public void addProducts(Product newProduct) {
		mangedProducts[numProducts++] = newProduct;
		Arrays.sort(mangedProducts,0,numProducts);

	}

}
