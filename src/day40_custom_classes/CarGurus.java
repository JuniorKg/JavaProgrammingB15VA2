package day40_custom_classes;

public class CarGurus {
    public static void main(String[] args) {


        Car acura = new Car();

        acura.model = "ILX";
        acura.color = "White";
        acura.price = 28150.0;
        acura.year = 2020;

        System.out.println("acura.model = " + acura.model);
        System.out.println("acura.color = " + acura.color);
        System.out.println("acura.price = " + acura.price);
        System.out.println("acura.year = " + acura.year);

        acura.drive();
        acura.showPrice();
        acura.showColor();


        Car bmw = new Car();

        bmw.model = "BMW 5 series";
        bmw.color = "Blue";
        bmw.price = 51115.0;
        bmw.year = 2019;

        Car porsche = new Car();
        porsche.setCarInfo("Porsche 911", 127753, "Red", 2020);
        porsche.drive();
        porsche.showColor();
        porsche.showPrice();

        Car toyota=new Car();
        toyota.setCarInfo("Corolla", 14778,"Red", 2019);
        toyota.drive();
        toyota.showPrice();

        acura.getCarInfo();
        bmw.getCarInfo();
        porsche.getCarInfo();
        toyota.getCarInfo();


        if (bmw.price > porsche.price){
            System.out.println("BMW is more expensive");
        } else {
            System.out.println("Porshe is more expensive");
        }





    }
}