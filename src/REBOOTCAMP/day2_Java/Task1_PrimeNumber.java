package REBOOTCAMP.day2_Java;

/**
 * Create a method that will accept a number and print all the prime number from 2 to that given number
 */
public class Task1_PrimeNumber {

    public static void primeNum(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;


}

    public static void main(String[] args) {
        primeNum(100);
    }
}
