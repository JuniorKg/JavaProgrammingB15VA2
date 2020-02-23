package day57_exceptions2;
import java.util.*;
public class OutOfMemoryDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i > 0 ; i++) {

            nums.add(i);


        }

    }
}
