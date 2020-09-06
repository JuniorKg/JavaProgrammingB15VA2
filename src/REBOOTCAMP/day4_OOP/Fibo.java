package REBOOTCAMP.day4_OOP;

public class Fibo {
    public static void main(String[] args) {
        Fibo(10);
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
