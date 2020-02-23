package day60_collections2;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
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

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * this method returns an int of 3 types
     * 1. Positive number  -> this Product is larger than another Product
     * 2. Zero 0 -> this Product and another Product are equal
     * 3. Negative number -> this Product is smaller than another Product
     */
    @Override
    public int compareTo(Product anotherProduct) {
        //return this.name.compareTo(anotherProduct.name)
        if(this.price > anotherProduct.price){
            return 1; //any positive number
        } else if (this.price == anotherProduct.price){
        return 0;
    } else {
            return -1;
        }
        }
}

