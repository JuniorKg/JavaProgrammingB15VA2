package day33_methods;

public class Calculator {
    public static void main(String[] args) {

        addNums(2, 3);

        int sum = add(10,4);

        System.out.println("sum from method: " + sum);
        System.out.println(add(44,22));

        int result = subtract(27, 56);
        System.out.println("subtract result: " + result);
        System.out.println((subtract(27, 56)));


    }

    public static void addNums(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Result = " + result);
    }

    public static int add (int num1, int num2){
        int result = num1 + num2;
        return result;

    }

    public static int subtract (int num1, int num2){
        int result = num2 - num1;
        return result;
    }


}
