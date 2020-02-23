package day60_collections2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratingCollection {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("java"); list.add("js");
        list.add("html"); list.add("ruby");
        list.add("python"); list.add("kotlin");

        for (String each: list){
            System.out.println(each);
            //list.remove(each); Error ConcurrentModificationException
            //list.remove(0); Error ConcurrentModificationException
            //list.add("C#"); Error ConcurrentModificationException
        }

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//            list.remove(i);

        /**
         * Iterator interface can be used to iterator.
         * Declaring Iterator variable and assigning our list
         */

        Iterator<String> it = list.iterator();

//        System.out.println(it.hasNext());//true
//        System.out.println(it.next()); // java
//        System.out.println(it.next());//js
//        System.out.println(it.next());//html

        while (it.hasNext()){
            System.out.println(it.next());//print current value and going to next
            it.remove(); // remove current value
        }

        System.out.println(list.toString()); // list is now empty
    }


    }

