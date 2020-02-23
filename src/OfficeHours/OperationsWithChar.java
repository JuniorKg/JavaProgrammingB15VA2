package OfficeHours;

public class OperationsWithChar {
    public static void main(String[] args){

        char char1 = 'a';
        char char2 = 'B';

        int num1 = 15;
        int num2 = 8;

        System.out.println("We are batch" + (char1+num1) + " in Cybertek");
        //We are batch 81 in Cybertek

        System.out.println("We are batch " + char2+num1 + " in Cybertek");
        // We are batch B15 in Cybertek


        System.out.println("We are batch " + (char1 + num1) + " in Cybertek");
        //We are batch 113 in Cybertek

        int num3 = num2 +char1;
        System.out.println(num3);

        char char3 = 50;

        System.out.println("char3 is " +num3);

        int num4 = char3;

        System.out.println("num4 " +num4);


    }
}
