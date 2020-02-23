package day19_for_loop_2;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 10;

        if (num < 1 || num >10) {
            System.out.println("ERROR: Invalid Input");
            //return;

        }
        for (int n = 1; n<=10; n++){
            int result = n*num;
            System.out.println(n+ "*" + num + "=" + result);

        }
    }
}
