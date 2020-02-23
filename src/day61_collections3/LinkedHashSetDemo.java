package day61_collections3;
import java.util.*;
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        set.add("java");
        set.add("java");
        set.add("selenium");
        set.add("html");
        set.add("sql");
        set.add("git");
        set.add("ruby");


        System.out.println("size: " + set.size());

        System.out.println(set.toString());

        set.remove("java");

        set.forEach(value -> System.out.println(value));

        for(String each : set){
            System.out.println(each);
        }

    }
}
