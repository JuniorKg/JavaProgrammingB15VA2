package day32_custommethods;

public class EtsySearch {
    public static void main(String[] args) {

        openBrowser();
        navigateToEtsy();
        searchForWoodenSpoon();
        printResults();

    }

    public static void openBrowser() {
        System.out.println("---------------------");
        System.out.println("Click on Chrome icon");
        System.out.println("Wait for browser to load");
        System.out.println("-----------------------");

    }

    public static void navigateToEtsy() {
        System.out.println("-----------------------");
        System.out.println("Type etsy.com to address bar");
        System.out.println("Click on Enter");

    }

    public static void  searchForWoodenSpoon() {
        System.out.println("-----------------------");
        System.out.println("Type wooden spoon into search field");
        System.out.println("Click on search icon");


    }

    public static void  printResults(){
        System.out.println("-----------------------");
        System.out.println("Total results: wooden spoon (14,581 Results)");

    }

}