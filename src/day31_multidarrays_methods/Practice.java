package day31_multidarrays_methods;

public class Practice {
    public static void main(String[] args) {
        int[][] teamScores = {
                {1, 5, 6, 9},
                {9, 2, 5, 5},
                {2, 1, 6, 8},
                {3, 5, 6, 8},
                {1, 7, 9, 3},
        };

        int sum = 0;
        for (int[] nums1D : teamScores) {
            for (int num : nums1D) {
                sum += num; // sum += nums2D[i][j]

                /*
                Warm up task:
Create a 2D int[] array called teamScores with 4 rows and 5 cols each. Assign different numbers in 1-10 range
Each row represents score that team accumulated.
Loop through each team scores and find the team-row with highest score and print out details.
                 */
            }


        }
    }
}
