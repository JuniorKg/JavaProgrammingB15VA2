package day04_math_operators_scanner;
import java.util.Scanner;
public class WhatIsYourNameScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Type a print message asking "What is you name?
        System.out.println("What is your name?");

        //Lets declare variable for name

        String name = input.next();


        System.out.println("Nice to meet you, "+ name);




    }
}
