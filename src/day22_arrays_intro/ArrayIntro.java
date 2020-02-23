package day22_arrays_intro;

public class ArrayIntro {
    public static void main(String[] args) {
        // declare int array with size 4
        int [] nums = new int [4];
        // assign value to each index
        nums[0] = 100;
        nums[1]= 200;
        nums[2] = 700;
        nums[3] = -5;
        // num[4] = 1 ; ArrayIndexOutOfBoundsException
        //print first number in the array
        System.out.println("number at index 0 : " + nums[0]);
        System.out.println("number at index 1 :"  + nums[1]);
        System.out.println("number at index 2 :"  + nums[2]);
        int third = nums[3];
        System.out.println("number at index 3 :" + third);
        //System.out.println(nums[4]); // arrayIndexOutOfBoundsException

        int i = 0;
        System.out.println(nums[i]);//100
        i++; //1
        System.out.println(nums[i]);//200

        //Find out how many elements / values
        System.out.println("Number of elements: " + nums.length);
        int len = nums.length;
        System.out.println("len = " + len);

        //modify index 0 to 222
        nums[0] = 222;
        System.out.println("number at index 0 : " + nums[0]);

        nums[1] = 500;
        System.out.println("number at index 1 :"  + nums[1]);

        nums[2] = nums[1];
        System.out.println(nums[2]);
    }
}
