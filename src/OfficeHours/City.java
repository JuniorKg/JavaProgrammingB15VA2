package OfficeHours;

public class City {
    String name;
    long population;
    /**
     *
     */
    int area;
    String country;
    String crimeRate;
    boolean isCountryCapital;
    boolean hasRiver;

    public City(){
        System.out.println("City no Args Constructor is executed");
    }

    public City(String name){
        this.name = name;
        System.out.println("City with Name Constructor is executed");
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", country='" + country + '\'' +
                ", crimeRate='" + crimeRate + '\'' +
                '}';
    }
}
