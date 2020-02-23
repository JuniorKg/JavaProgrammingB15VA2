package day28_review;

import java.util.Arrays;

public class FillArrayLoop {
    public static void main(String[] args) {

        int [] numbers = new int [101];
        //numbers[0] =200;
        for (int i = 0; i <= 100 ; i++) {
            numbers[i] = i;
            }
            System.out.println(Arrays.toString(numbers));

        //PRINT same array in reverse in the same line
        System.out.println("[");
        for (int i = numbers.length-1; i >= 0; i--){
            System.out.print(numbers[i]+ ", ");
        }
        System.out.println("]");

        }


    }

