package day50_inheritance_hiding;

public class CityObjects {
    public static void main(String[] args) {
        City city = new City("Calamba");
        CapitalCity capital = new CapitalCity("Moscow", "Russia", 20000000L);

        System.out.println(city.toString());
        System.out.println(capital.toString());

        //static way of calling: ClassName.methodName
        City.buildARoad();
        CapitalCity.buildARoad();

        //
        city.buildARoad();
        capital.buildARoad();



        //call using object
        capital.letsBuildARoad();
        city.letsBuildARoad();

        //Test method hiding
        CapitalCity astana = new CapitalCity("Nursultan", "Kazahstan", 12000000L);
        astana.letsBuildARoad(); //this calling buildARoad which is hidden



        CapitalCity ankara = new CapitalCity("Ankara", "Turkey", 80000000L);
        ankara.letsBuildARoadInCapital();
        ankara.letsBuildARoad();


        //================================
        /*
        LetBuildARoad() method is in City class
        letsBuildARoadInCapital()method is in CapitalCity class
        both of them are calling buildARoad() method
         */
    }
}
