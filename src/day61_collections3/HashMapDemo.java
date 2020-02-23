package day61_collections3;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        //    KEY ,  VALUE
        Map <String, Double>   items = new HashMap<>();

        items.put("eggs", 2.99);
        items.put("strawberries", 7.99);
        items.put("potatoes", 7.0);
        items.put("cat food", 18.00);
        items.put("milk", 3.99);
        items.put("cookies", 3.49);
        items.put("cookies", 3.00);

        System.out.println(items.toString());
        System.out.println("size: " + items.size());

        System.out.println("price of eggs: " + items.get("eggs"));
        System.out.println(items.get("strawberries"));
        System.out.println(items.get("potatoes"));
        System.out.println(items.get("cat food"));
        System.out.println(items.get("milk"));
        System.out.println(items.get("cookies"));

        System.out.println(items.keySet());
        System.out.println(items.values());

        for (String key:items.keySet()) {
            System.out.print("key: " +key);
            System.out.println(", value: " +items.get(key));

        }



    }
}
