package MyPractice;
import java.util.Scanner;
public class Convertation {
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        System.out.println("How many pounds of sugar you need for this recipe? ");
        double sugar = info.nextDouble();
        System.out.println("Let me tell you how much it will be in killograms!");
        double kg = sugar*0.453;
        System.out.println("In killograms it will be " +kg);

        System.out.println("What is my weight in killograms? ");
        double weight = info.nextDouble();
        double kgw = weight*0.453;
        System.out.println("Your weight in killograms is " +kgw);





    }
}
