package store.entity;

import java.util.Arrays;

public class ProductManager extends User {
	public static final int MAX_PRODUCTS = 100;
	
	private Product[] managedProducts = new Product[MAX_PRODUCTS];
	private int numProducts = 0;
	
	public Product[] getProducts() {
		return Arrays.copyOf(managedProducts, numProducts);
	}
	
	
	public ProductManager() {
		super();
	}

	public ProductManager(String username, String email, String fName, String lName, String password,
			Role role) {
		super( username, email, fName, lName, password, role);
	}

	public ProductManager(String username, String email, String fName, String lName, String password, Product[] products) {
		super( username, email, fName, lName, password);
		for(Product p: products)
			addProduct(p);
	}
	
	public void addProduct(Product newProduct) {
		managedProducts[numProducts++] = newProduct;
		Arrays.sort(managedProducts,0,numProducts);
	}
	
	public ProductManager(long id) {
		super(id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ID: ");
		builder.append(getId());
		builder.append("\nUsername: ");
		builder.append(getUsername());
		builder.append("\nEmail: ");
		builder.append(getEmail());
		builder.append("\nName: ");
		builder.append(getfName()).append(" ");
		builder.append(getlName());
		builder.append("\nRole: ");
		builder.append(getRole()).append("\nProducts:");
		Product[] products = getProducts();
		for(Product p: products) {
			builder.append(String.format("\n  %-25s | %-15s | %6.2f",p.getName(),p.getSupplier(),p.getPrice()));
		}
		builder.append("\n"); 
		return builder.toString();
	}


	public void addProducts(Product newProduct) {
		managedProducts[numProducts++] = newProduct;
		Arrays.sort(managedProducts,0,numProducts);

	}

}
