package day37_arraylist;
import java.util.*;
public class RemoveInteger {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();

        nums.add(4);
        nums.add(3);
        nums.add(8);
        nums.add(2);
        nums.add(1);
        nums.add(7);
        nums.add(5);
        nums.add(3);

        System.out.println("Nums count : " + nums.size());

        nums.remove(0); //remove number from index 0
        System.out.println(nums);

        nums.remove(Integer.valueOf(7)); //remove value - 7  and print
        System.out.println(nums);

        //create an Integer wrapper object with value 11
        Integer n = Integer.valueOf(11); // create wrapper object
        nums.remove(n);



    }

}
