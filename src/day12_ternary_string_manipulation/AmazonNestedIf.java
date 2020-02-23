package day12_ternary_string_manipulation;

public class AmazonNestedIf {
    public static void main(String[] args) {
        Boolean isPrimeMember = true;
        double totalOderPrice = 23.45;

        if (isPrimeMember) {
            System.out.println("Eligible for free Shipping");
            } else {
            if (totalOderPrice > 25.0) {
                System.out.println("Eligible for free Shipping");
            } else {
                System.out.println("Not Eligible for Free Shipping");
            }

        }
    }
}
