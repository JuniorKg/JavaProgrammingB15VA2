package day22_arrays_intro;

public class SumOfArray {
    public static void main(String[] args) {
        //double[] prices = new double[6];
        
        double[] prices = {23.12, 23.99, 5.89, 2.78, 99.99, 89};
        double totalPrice = 0.0;

        for (double each : prices) {
            totalPrice += each;
        }

            System.out.println("totalPrice: " + totalPrice);

        double moreThan50 = 0.0;

        for(double anyvariable  : prices){
            if (anyvariable > 50) {
                moreThan50 += anyvariable;
            }
            }
            System.out.println( moreThan50);

        //loop through each item and if you find price more than 100
        //print "Item is too expensive, you dont need that!"
        //exit the loop

        for (double price : prices){
            if (price > 100){
                System.out.println(price + "Item is too expensive, you dont need that!");
                break;
            }
        }
        }

        }
        
/*
check with this one later
package day22_arrays_intro;
public class SumOfArray {
    public static void main(String[] args) {
       // double[] prices = new double[6];
        double[] prices = {34.4, 123.4, 10.5, 4.33, 76.4, 90};
        double totalPrice = 0.0;
        for(double each : prices){
            totalPrice += each;
        }
       // System.out.println(each); will not work
        System.out.println("totalPrice = " + totalPrice);
        double moreThan50 = 0.0;
        for(double p : prices){
            if(p > 50.0){
                moreThan50 += p;
            }
        }
        System.out.println("moreThan50 = " + moreThan50);
        //loop through each item and if u find price more than 100
        //print "Item too expensive, you dont need that"
        //exit the loop
        for(double price : prices){
            if(price > 100){
                System.out.println(price+ " - Item too expensive, you dont need that");
                break;
            }
        }

    }
}

 */
