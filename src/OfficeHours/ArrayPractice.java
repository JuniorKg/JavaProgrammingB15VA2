package OfficeHours;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        /*
        given an int array
        1. find average between all numbers
          - add all numbers in array
          - loop through array and find the sum
          - divide the sum of by the array length
        2. count how many elements in array
         is above or equal to average
          - create int count = 0
          - loop through array and check if element
          - if element >= average count ++
         3. create new array with all elements
          that are above or equal to average
           - create empty array with size of count
           - loop through array and check each element
            if element >= average we will add it to a new array
         */

        int[] arr = {20, 0, -5, 20, 1, 12, 30, 8, 9};

        int sum = 0;

        for (int num : arr) {
            sum += num; // sum = sum + num ; sum = 95

        }

        int average = sum / arr.length;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= average) {
                count++; //count= count +1;
            }
        }

        int nums[] = new int[count]; // this will create an array with the size of count
        // [0, 0, 0, 0] - > expecting [20,20,12,30]

        int indx = 0;
        for (int i = 0; i <= nums.length; i++) {
            if (arr[i] >= average) {
                nums[indx] = arr[i];
                indx++;
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(("average :" + average));
            System.out.println(Arrays.toString(nums));

            //Arrays methods

            String[] words = {"apple", "grapes", "bananas"};
            String words_str = "apple, grapes, bananas";

            // create String array out of words_str and compare it with words

            System.out.println(Arrays.toString(words));
            String[] words2 = words_str.split(",");
            // it will split String by comma an will give us a String array as result
            System.out.println(Arrays.toString(words2));
            boolean result = Arrays.equals(words2, words);
            System.out.println("Are arrays equal?" + result);


        }
    }
}