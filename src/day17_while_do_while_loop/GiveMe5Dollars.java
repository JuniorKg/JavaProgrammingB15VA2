package day17_while_do_while_loop;
import java.util.Scanner;
public class GiveMe5Dollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 dollars");
        int money  = scan.nextInt();


        while (money!=5){
                System.out.println("Give me 5 dollars");
                money = scan.nextInt();
            }

        System.out.println("Thank you for 5 dollars");
        }
    }

