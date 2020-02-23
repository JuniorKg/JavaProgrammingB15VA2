package day06_operators;
import java.util.Scanner;
public class MinutestoHours {
    public static void main(String[] args){

        int minutes = 1000;
        int hours = minutes/60; //2
        System.out.println(hours);
        int remainingMinutes = minutes%60; //15



        System.out.println(remainingMinutes);
        System.out.println(hours + " hours "+remainingMinutes + " minutes");




    }
}
