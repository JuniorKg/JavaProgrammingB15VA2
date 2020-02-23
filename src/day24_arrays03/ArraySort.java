package day24_arrays03;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] nums = {44, 1, 76, 12, 2, 90};
        System.out.println("before sorting" + nums);
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums); // sorting nums array values
        System.out.println("after sorting");
        System.out.println(Arrays.toString(nums));

        //declare companies

        String[] companies = {"Apple", "Delta", "Samsung", "Lexus", "Honda"};
        Arrays.sort(companies);
        System.out.println(Arrays.toString(companies));
        System.out.println(companies [0]);












    }
}
