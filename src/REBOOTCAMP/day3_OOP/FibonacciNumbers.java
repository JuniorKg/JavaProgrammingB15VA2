package REBOOTCAMP.day3_OOP;

public class FibonacciNumbers {

    public static void main(String[] args) {
        Fibo(8);

    }
        public static void Fibo(int num){
        int one = 0;
        int two = 1;
            System.out.print(one + " " + two);

        for (int i = 2; i < num; i++){
            int next = one + two;
            one = two;
            two = next;
            System.out.print(" " + next);





       }


   }
}
