package day35_wrapper_classes;

public class Recursion {
    public static void main(String[] args) {
        printNum(5);
    }

    public static void printNum(int num) {
        if (num < 0) { // terminate condition
            System.out.println(num);
            printNum(num+1);
        } else {
            return;
        }
    }
}
