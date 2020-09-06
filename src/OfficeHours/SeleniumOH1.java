package OfficeHours;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SeleniumOH1 {

    /**
    -Iterator
    -List, Set, Map and other types of collections can use Iterator class to iterate over that collections
    -List has indexes (for i, for each, while, Iterator)
    -Map (for each loop, Iterator - to loop through keys)
     */

    public static void main(String[] args) {
        //create ArrayList of String - Iterate over it
        ArrayList <String> keysToSearch = new ArrayList<>();
        keysToSearch.add("fruits");
        keysToSearch.add("veggies");
        keysToSearch.add("berries");

        Iterator iterator = keysToSearch.iterator();
        //iterator() - return Iterator type which we can use with all iterator methods
        //fruits, veggies, berries
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /**
         * add * to each String in list before printing
         */
        Iterator <String> iterator1 = keysToSearch.iterator();
        while (iterator1.hasNext()){
            String item = iterator1.next();
            System.out.println(item);
            System.out.println("*" + item);
        }

        //create a map with <String, String>
        HashMap<String, String> personalInfo = new HashMap<>();
        personalInfo.put("name", "Bryan");
        personalInfo.put("student_id", "232321324");
        personalInfo.put("major", "computer science");
        Iterator <String> mapIterator = personalInfo.keySet().iterator();
        while (mapIterator.hasNext()){
            String key = mapIterator.next();
            System.out.println(mapIterator.next() + ":" + personalInfo.get(key));

        }
    }
}
