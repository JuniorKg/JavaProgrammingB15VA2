package day24_arrays03;

public class CopyArray {
    public static void main(String[] args) {


        int[] nums1 = {23, 55, 34, 87, 90, 123, 30};
        //declare nums2 with same size as nums1
        int[] nums2 = new int[nums1.length];
        System.out.println("nums1 length: " + nums1.length);
        System.out.println("nums2 length: " + nums2.length);

        //using for loop, read all values from nums1 and assign to nums2

        for (int idx = 0; idx < nums1.length; idx++) {
            nums2[idx] = nums1[idx];
        }

        //print values from nums1 and nums2 using for each loop

        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : nums2) {
            System.out.print(num + " ");
        }

        //declare nums3 with same size as nums1 and assign all values in doubles
        int [] nums3 = new int [nums1.length];
        // aassign all values in double
        System.out.println();
        for (int i = 0; i < nums1.length; i++){
            nums3[i] = nums1[i]*2;
            System.out.print(nums3[i] + " ");
        }

        System.out.println();

        for(int n : nums3){


        }

    }

}