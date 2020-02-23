package day34_methodsPractice;

import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        sum(20);
        sum(23,43);
        sum(12,11,45,65,76,45,34);
        sum();

    }



    public static void sum ( int... nums){
        System.out.println(Arrays.toString(nums));
    }
}
