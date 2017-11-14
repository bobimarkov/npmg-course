package Store;

import java.util.Objects;

public class Product {
    private static long nextId = 0;
    private long id = nextId++;
    private String name;
    private double price;


    public Product() {}

    public Product(long id){
        this.id = id;
    }

    public Product(String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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
        return String.format("Id: %s \nName: %s\nPrice: %s\n\n",id,name,price);
    }

    public static void main(String[] args){
        Product P1 = new Product("iRqn",65.28);
        Product P2 = new Product("Universe S6",124.22);
        System.out.println(P1);
        System.out.println(P2);

        System.out.println(P1.equals(P2));
    }
}