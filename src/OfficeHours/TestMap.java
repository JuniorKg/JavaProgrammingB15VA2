package OfficeHours;

import java.util.HashMap;
import java.util.Iterator;

public class TestMap {
    public static void main(String[] args) {
        HashMap <Integer, String> digits = new HashMap<>();
        // we use .put name(key, value) to insert some values to map
        digits.put(1, "one");
        System.out.println(digits.size());
        digits.put(5, "five");
        digits.put(10, "ten");
        System.out.println("size of map: " + digits.size());
       // digits.clear(); //remove all values from map
        //System.out.println("size of map: " + digits.size());


        //keyset - will give us a set of the keys [1,5,10]
        for (Integer each: digits.keySet()){
            System.out.println(digits.get(each));
        }

        Iterator <Integer> iterator = digits.keySet().iterator();
        while (iterator.hasNext()){
            //we store next value of iterator to a variable so we can reuse
            //it multiple tiomes during 1 iteration of the loop
            Integer iterValue = iterator.next();
            System.out.println(iterValue + "");
            //printing the value
            System.out.println(digits.get(iterValue));

        }
        System.out.println(digits.toString());

        //.replace(key, value)

        digits.replace(1, "ONE");
        System.out.println("map after replacement: " + digits);

        if (digits.containsKey(10)){
            digits.replace(10, "TEN");
        }
        System.out.println("map after replacement: " + digits);

        digits.replace(6, "SIX"); // it will not give an exception
        System.out.println(digits);

        if (digits.containsValue("five")){
            digits.replace(5, "FIVE");
        }

        System.out.println(digits);


        //.remove(key .remove(key, value)

        digits.remove(1);
        System.out.println("after first remove: " + digits);
        digits.remove(5, "FIVE");


    }
}
