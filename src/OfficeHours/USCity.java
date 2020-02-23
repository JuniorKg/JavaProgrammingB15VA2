package OfficeHours;

public class USCity extends City {
    /* By default if we used extends City we already have these fields in USCity
    String name;
    long population;
    int area;
    String country;
    String crimeRate
     */

    String state;
    int zipCode;
    String stateCapital;
    boolean isStateCapital;

    public USCity(String name){
        this.name = name; //because name is inherited
        System.out.println("USCity Name Constructor is Executed");
    }



}
