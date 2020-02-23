package day17_while_do_while_loop;
import java.util.Scanner;
public class GiveMe5Or10Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me 5 or 10 dollars");
        int money  = scan.nextInt();


        while (money!=5 && money!=10){
            System.out.println("Give me 5 or 10 dollars");
            money = scan.nextInt();
        }

        System.out.println("Thank you for your " +money);



    }
}
