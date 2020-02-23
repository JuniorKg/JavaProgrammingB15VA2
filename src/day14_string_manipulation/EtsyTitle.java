package day14_string_manipulation;

public class EtsyTitle {
    public static void main(String[] args) {
        String title = "Wooden spoon | Etsy";

        if (title.startsWith("Wooden spoon")
                && title.contains("|")
                && title.endsWith("Etsy")) {
            System.out.println("Test passed. Etsy title is correct");
        }else {
            System.out.println("Test failed. Etsy title has bugs");
        }


    }
}
