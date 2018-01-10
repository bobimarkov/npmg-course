package store.entity;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private static long nextId = 0;
    private long id = nextId++;
    private String name;
    private double price;
    private double weight;
    private String supplier;
    private MeasuringUnits mu;

    public Product() {}
    
    public Product(long id) {
    	this.id = id;
    }

    public Product(String name, double price) {
    	this.name = name;
    	this.price = price;
    }
    
    public Product(String name, double price, double weight) {
        this(name,price);
        this.weight = weight;
    }

    public Product(String name, double price, double weight, String supplier) {
        this(name,price,weight);
        this.supplier = supplier;
    }

    public Product(String name, double price, double weight, String supplier, MeasuringUnits mu) {
        this(name,price,weight,supplier);
        this.mu = mu;
    }

    public Product(Product other){
        this.name = other.name;
        this.price = other.price;
        this.weight = other.weight;
        this.supplier = other.supplier;
        this.mu = other.mu;
    }

    public long getId() {
    	return this.id;
    }
    
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public MeasuringUnits getMu() {
		return mu;
	}

	public void setMu(MeasuringUnits mu) {
		this.mu = mu;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return String.format("Id: %s \nName: %s\nPrice: %s\nWeight: %s\nSupplier: %s\nMeasuring Unit: %s\n\n",id,name,price,weight,supplier,mu);
    }

    public static void main(String[] args){
        Product P1 = new Product("iRqn",65.28,21.56);
        Product P2 = new Product("Universe S6",124.22,24.54);
        System.out.println(P1);
        System.out.println(P2);

        System.out.println(P1.equals(P2));
    }

	@Override
	public int compareTo(Product o) {
		return (int)Math.signum(o.getId() - getId());
	}
}