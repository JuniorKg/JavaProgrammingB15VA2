package day28_review;
import java.util.*;
public class ArrayRandomNumbers {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] numbers = new int[10];
        //how to generate 0 - 100 numbers using Random
        System.out.println(rd.nextInt(101));
        for (int i = 0; i < 10; i++) {
            numbers[i] = rd.nextInt(101);
        }

        System.out.println(Arrays.toString(numbers));
        //sort it
        //print again

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int [] nums2 = {rd.nextInt(101), rd.nextInt(101), rd.nextInt(101), rd.nextInt(101),rd.nextInt(101), rd.nextInt(101)
        ,rd.nextInt(101), rd.nextInt(101),rd.nextInt(101), rd.nextInt(101)};

        for (int i = 0; i < 10; i++) {
            nums2[i] = rd.nextInt(101);
        }
        System.out.println(Arrays.toString(nums2));

    }
}


