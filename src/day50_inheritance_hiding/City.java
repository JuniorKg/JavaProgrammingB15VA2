package day50_inheritance_hiding;

public class City extends Object {
    private String name;


    public City(){
        name = "undefined";   //if you make you constructor private you wont be able to create objects
    }
    public City(String name) {
        this.name = name;
    }

    public static void buildARoad(){
        System.out.println("City - building a road...");
    }

    public void letsBuildARoad(){
        System.out.println("City - lets build a road");
        buildARoad();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name = " + name;
    }


}
