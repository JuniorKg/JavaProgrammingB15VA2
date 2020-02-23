package day09_multibranch_switch;

public class CalculatorV1 {
    public static void main(String[] args) {

        double num1 = 10;
        double num2 = 30;

        char operator = '-';

        if (operator == '+') {
            operator += num1 + num2;
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num2 - num1);
        } else if (operator == '*'){
            System.out.println(num1*num2);
        } else if (operator == '/'){
            System.out.println(num2/num1);
        } else {
            System.out.println("Invalid Operator");
        }
    }
}