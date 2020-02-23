package MyPractice;

import org.w3c.dom.ls.LSOutput;

public class Practice_Return {
    public static void main(String[] args) {
        int numberMax = max(4, 3);
        System.out.println(numberMax);
        System.out.println(max(64, 100));
        printAmessage();
        add(4, 4);
    }


    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

    public static void printAmessage() {
        System.out.println("Hello World");
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }
}
