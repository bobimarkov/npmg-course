package exam3;

import java.util.Scanner;

public class Product {
	private static Scanner sc = new Scanner(System.in); 
	
	private static long id_c = 0;
	private long id = id_c++;
	private String code;
	private String name;
	private double price;
	
	public Product() {}
	
	public Product(String code, String name, double price) {
		this.code = code;
		this.name = name;
		this.price = price;
	}
	
	
	
	public long getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void input() {
		System.out.print("Enter product code: ");
		 code = sc.nextLine();
		System.out.print("Enter product name: ");
		name = sc.nextLine();
		System.out.print("Enter product price: ");
		 price = Double.parseDouble(sc.nextLine());
		
	}
		
	public static void main(String[] args) {
		Product[] products = {
			new Product("1dasd74s","Wireless Keyboard",32.34),
			new Product("42dkaddk","Playstation 4",424.32),
			new Product()
		};
		
		products[2].input();
		for(int i=0;i<3;i++)System.out.println(products[i]);		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nId: ").append(id);
		builder.append("\nCode: ").append(code);
		builder.append("\nName: ").append(name);
		builder.append("\nPrice: ").append(price).append("\n");
		return builder.toString();
	}

	
	
}
