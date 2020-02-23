package day18_for_loop;

public class PrintEvenOddNumbers {
    public static void main(String[] args) {


        for (int n = 1; n <= 100; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");

            }
        }

        for (int n = 0; n <= 100; n++) {
            if (n % 2 != 0) {
                System.out.print(n + " ");

            }
        }
    }
}