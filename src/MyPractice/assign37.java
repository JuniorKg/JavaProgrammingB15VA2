package MyPractice;
import java.util.*;
public class assign37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int house = scan.nextInt();

        int player = scan.nextInt();


        //your code here
        if (house + player >=21){
            System.out.println("player = " +player);
            System.out.println(" house = " +house);
            System.out.println("bust");
        } else if (house > player){
            System.out.println("player =  " +player);
            System.out.println(" house = " +house);
            System.out.println("player loss");
        } else if (house == player){
            System.out.println("player = " +player);
            System.out.println(" house = " +house);
            System.out.println("its a tie");
        } else if (player > house){
            System.out.println("player = " +player);
            System.out.println(" house = " +house);
            System.out.println("player wins");
        }
        }
    }