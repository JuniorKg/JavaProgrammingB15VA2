package day03_primitives_mathoperators;

public class UsingVariables {
    public static void main(String[] args){
        int num1, num2, num3;
        num1 = 100;
        num2 = num1;
        num3 = num2;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        num1= 500;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
