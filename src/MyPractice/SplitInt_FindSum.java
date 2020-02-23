package MyPractice;
import java.util.*;
public class SplitInt_FindSum {
    public static void main(String[] args) {


        int num =324343;

        int sum = (num/100000%10) + (num/10000%10) + (num/1000%10) + (num/100%10) + (num/10%10) + (num/1%10);

        System.out.println(sum);


        int n = 12345678;
        String num1 = ""+n;
        String[] numbers = num1.split("");
        int[] intNum = new int[numbers.length];
        for(int i=0; i<intNum.length; i++){
            intNum[i] = Integer.parseInt(numbers[i]);
        }
        int sum1 = 0;
        for(int each : intNum){
            sum1 += each;
        }
        System.out.println("sum = " + sum);


        String text =  "fdsfsdgsdxyz gfdgd.xyzfdsfsfdxyz fgdfgdsgs.xyzfdsf";
        text = text.replace(".xyz", "");

        int count = 0;

        for (int i = 0; i < text.length() ; i++) {
            if (text.equals("xyz")) {
            }
        }
            System.out.println(count);

        int num3 = 3213432;
        int sum3 = 0;
        while (num3 != 0){
            sum3+= num3%10;
            num3 =  num3/10;
        }
        System.out.println("Sum: " + sum3);

        }




    }
