package day19_for_loop_2;

public class WeekDays {
    public static void main(String[] args) {
        for (int n = 1; n <=7; n++){
            // Using IF STATEMENT  OR WE CAN USE SWITCH OPERATOR
//            if (n == 1) {
//                System.out.println(n + ". Monday");
//            } else if  (n ==2) {
//                    System.out.println(n + ". Tuesday");
//                }  else if (n==3) {
//                System.out.println(n + ". Wednesday");
//            }  else if (n==4) {
//                System.out.println(n + ". Thursday");
//            }  else if (n==5) {
//                System.out.println(n + ". Friday");
//            }  else if (n==6) {
//                System.out.println(n + ". Saturday");
//            }  else if (n==4) {
//                System.out.println(n + ". Sunday");
//            } else {
//                System.out.println("No such day");

                switch(n) {
                    case 1:
                        System.out.println(n+ ". Monday");
                        break;
                    case 2:
                        System.out.println(n+ ". Tuesday");
                        break;
                    case 3:
                        System.out.println(n+ ". Wednesday");
                        break;
                    case 4:
                        System.out.println(n+ ". Thursday");
                        break;
                    case 5:
                        System.out.println(n+ ". Friday");
                        break;
                    case 6:
                        System.out.println(n+ ". Saturday");
                        break;
                    case 7:
                        System.out.println(n+ ". Sunday");
                        break;
                    default:
                        System.out.println("No such day");

                }
            }
            }
        }


