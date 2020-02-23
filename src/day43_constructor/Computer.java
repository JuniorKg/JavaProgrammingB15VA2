package day43_constructor;



public class Computer {
    private String brand;
    private String os;
    private double price;

    public Computer(){
        System.out.println("Computer no-args constructor");
        brand = "unknown brand";
        os = "unknown operating system";
    }
    public Computer(String brand, String os, double price){
        System.out.println("Computer 3 args constructor");
        this.brand = brand;
        this.os = os;
        this.price = price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public String getOs() {
        return os;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return "Computer{" +
                " brand = '" + brand + '\'' +
                ", os = '" + os + '\'' +
                ", price = " + price +
                '}';
    }
}

