package day36_wrapper_arraylist;
import java.util.ArrayList;
public class ArrayListWriteRead {
    public static void main(String[] args) {
        //declare ArrayList that can store integer values. nums

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(1321);
        nums.add(213);
        nums.add(43);
        nums.add(344);

        //print the number of values in the Arraylist
        // method .size()
        System.out.println("Number of values : " + nums.size());

        //print all values in single line using toString() method.
        System.out.print("All values: " + nums.toString());

        //print first number . at index 0
        System.out.println("First Number : " + nums.get(0));

        //print number at index 2

        System.out.println(nums.get(2));
        System.out.println();
        int i = 4;
        //print number at index i

        System.out.println(nums.get(i));
        System.out.println();

        for (int j = 0; j < nums.size(); j++) {
            System.out.println(nums.get(j));


        }

    }

}
