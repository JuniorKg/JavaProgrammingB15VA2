package day10_switch_logical_operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int apples = 10;
        int oranges = 20;

        System.out.println("### TRUTH TABLE FOR && OPERATOR ###");
        System.out.println("true && true" + (true && true));
        if (apples >= 10 && oranges == 20) {
            System.out.println("Condition was true");
        } else {
            System.out.println("Condition was false");
        }

        if (apples > 100 && oranges == 20) {
            System.out.println("Condition was true");
        } else {
            System.out.println("Condition was false");
        }

    }
}
