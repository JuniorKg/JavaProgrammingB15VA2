package day37_arraylist;
import java.util.*;
public class PriceList {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>(Arrays.asList(9.99, 5.44, 10.99, 2.49, 299.49, 57.5, 123.45));
        //calculate sum of all prices
            double sum = 0.0;

            // using for loop
        for (int i = 0; i < prices.size(); i++) {
            sum+= prices.get(i);
        }
        System.out.println(sum);
        System.out.println();

        double sum2 = 0.0;
        // for each loop
        for (double each : prices){
            sum2+= each;
        }
        System.out.println(sum2);
        //declare double arrayList cheap
        //add all the prices that are less than 20.0
        List <Double> cheap = new ArrayList<>();
        List <Double> expensive = new ArrayList<>();

        for (double price : prices){
            if (price < 20) {
                cheap.add(price);
            }else {
                expensive.add(price);
            }
        }
        System.out.println(cheap);
        System.out.println(expensive);

    }


}
