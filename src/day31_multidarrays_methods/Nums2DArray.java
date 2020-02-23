package day31_multidarrays_methods;

import java.util.Arrays;

public class Nums2DArray {
    public static void main(String[] args) {
        int[][] nums2D = {
                {12, 55, 4, 7},
                {123, 555, 9},
                {56, 87, 455, 34},
                {234, 12, 54, 23, 23},
        };

        //print length of each 1d array

        for (int i = 0; i < nums2D.length; i++) {
            System.out.println(nums2D[i].length);
            System.out.println(Arrays.toString(nums2D[i]));
        }
        for (int each = 0; each < nums2D.length; each++) {
            Arrays.sort(nums2D[each]);
        }
        System.out.println(Arrays.deepToString(nums2D));

        for (int row = 0; row < nums2D.length; row++) {
            for (int col = 0; col < nums2D[row].length; col++) {
                System.out.print(nums2D[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("##### FOR EACH LOOP #####");

        for (int[] nums1D : nums2D) {
            for (int num : nums1D) {
                System.out.print(num + " ");
            }
        }
            System.out.println();

            //Count sum of ALL NUMBERS AND PRINT OUT


            int sum = 0;
            for(int[] nums1D : nums2D){
                for(int num : nums1D){
                    sum += num; // sum += nums2D[i][j]
                }
            }
            System.out.println("sum = " + sum);


        }


        }




