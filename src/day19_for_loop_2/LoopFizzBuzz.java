package day19_for_loop_2;

public class LoopFizzBuzz {
    public static void main(String[] args) {

        for (int n = 0; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n + " is FizzBuzz number");
            }
            else if (n % 3 == 0) {
                System.out.println(n + " is Fizz number");
            }
            else if (n % 5 == 0) {
                System.out.println(n + " is Buzz number");

            }
        }
    }
}




