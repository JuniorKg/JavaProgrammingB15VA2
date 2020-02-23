package day04_math_operators_scanner;

public class MathOperations {
    public static void main(String [] args){
        System.out.println(5+7);
        System.out.println(100-45);
        System.out.println(40*48);
        System.out.println(500/4);

        int chairs = 100 + 5;
        System.out.println("Chairs: " +chairs);

        int tables = chairs - 10;
        System.out.println("tables: " +tables);

        int a = 4;
        int b = 5;
        int c = a * b;

        System.out.println("c value: " +c);

        int slices = 8;
        int friends= 4;
        int slicePerFriend = 8 / 4;

        System.out.println("slice Per Friend: " + slicePerFriend);
    }
}