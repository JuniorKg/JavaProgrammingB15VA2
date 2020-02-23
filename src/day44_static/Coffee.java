package day44_static;

public class Coffee {
    private String name;
    private String size;
    private double price;

    //Encapsulate, toString
    //2 constructors :
    /*
    - no args
    - 3 args
     */


    public Coffee(String name, String size, double price){
        this.name = name;
        this.setSize(size);
        this.price = price;
    }

    public Coffee() {
        this.name = "undecided";
        this.size = "notsure";
        this.price = 0.0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        if (size.equals("Tall") || size.equals("Grande") || size.equals("Venti")){
            this.size = size;
        } else {
            System.out.println("Invalid size" + size);
            this.size = "unknown";
        }
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
    public void drink(){
        System.out.println("Drinking: " + name + size);
    }





    }


