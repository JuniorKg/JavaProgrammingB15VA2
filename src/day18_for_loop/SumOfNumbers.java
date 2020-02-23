package day18_for_loop;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int num = 0; num <= 5; num++) {
            sum+=num;
            System.out.println("sum = " + sum);

        }
    }
}