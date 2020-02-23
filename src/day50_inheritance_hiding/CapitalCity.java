package day50_inheritance_hiding;

public class CapitalCity extends City {
    private String country;
    private long population;


    public CapitalCity(){
        super();
    }
    // CapitalCity c = new CapitalCity("Paris", "France", 2100000L)
    public CapitalCity(String name, String country, long population){
        super(name);
        setName(name);
        this.country = country;
        setCountry(country);  // if you have some conditions ex. If ...
                               // you use this one instead of making your data private


    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPopulation() {
        return population;
    }



    public void setPopulation(long population) {
        this.population = population;


    }
    public static void buildARoad(){
        System.out.println("Capital city - building a road...");
    }
    public void letsBuildARoadInCapital(){
        System.out.println("City - lets build a road");
        buildARoad();
    }
    }

