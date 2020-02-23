package OfficeHours;

public class Car {

    public static void main(String [] args){

        String make, model, color = "Red";
        int year = 2015, milage = 50000;

        make = "Honda";
        model = "Accord";

        System.out.print(year);  //2015
        System.out.println(": " + make + " " + model);

        System.out.println(year + " " +  milage); //2015 50000
        System.out.println("year: " + year + milage); //year: 201550000
        System.out.println("year: " + (year+milage)); //year: 52015
        System.out.println(year + milage + "year"); //52015 year
    }
}
