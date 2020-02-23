package day21_forloop_4_arrayintro;

public class MultiplactionTablev2 {
    public static void main(String[] args) {
        for (int outer =1; outer <=10; outer++){

            System.out.println("\nTABLE FOR #" + outer);
            System.out.println("----------");
            for(int inner = 1; inner <= 10; inner++){
                int result = inner*outer;
                System.out.println(inner+ " x " + outer + " = " +result);
            }
        }

//        for (int n = 1; n <= 10; n++){
//            int result = n*2;
//            System.out.println(n + " x 2 = " +result);
        }
    }

