package day12_ternary_string_manipulation;

public class Fizzbuzz {
    public static void main(String[] args) {
        int num = 40;

        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println(num + "fizzBuzz");
        } else if (num % 3 == 0) {
        System.out.println("fizz");
    }else if (num%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println("Error");
        }

    }
}
