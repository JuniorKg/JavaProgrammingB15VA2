package day62_collections4;
import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        //declare hashmap
       // Map employees = new HashMap(); -> we can use it but not recommended
        Map<Object, Object> rawMap = new HashMap();
        rawMap.put(1234, 4567);
        rawMap.put(true, false);
        rawMap.put("key", "value");
        rawMap.put("potatoes", 7.99);
        System.out.println("rawMap = " + rawMap);

        //declare polymorphic Map <Integer, String>

        Map <Integer, String> employees = new HashMap<>();

        HashMap <Integer, List<String>> empMap = new HashMap<>();

        List<Map<Integer, String>> list = new ArrayList<>();

        employees.put(10, "Wali");
        employees.put(20, "Nijat");
        employees.put(30, "Yassine");
        employees.put(40, "Amir");
        employees.put(50, "Luba");
        employees.put(60, "May");
        employees.put(70, "Imad");
        employees.put(80, "Nassif");


        System.out.println(employees.toString());

        System.out.println(80 + "-"+employees.get(80)); //Nassif
        int id = 20;
        System.out.println(id + "-"+employees.get(id)); //Nijat

        //Amir - OUT, Tahmina for id 40
        employees.replace(40, "Tahmina");
        id = 40;
        System.out.println(id + "-" + employees.get(id));

        employees.put(40, "Imtiaz");
        System.out.println(id + "-" +employees.get(id));

        System.out.println("---------SIZE METHOD----------");

        System.out.println(employees.size());

        System.out.println("---remove(key) method---");
        employees.remove(10);
        System.out.println(employees.toString());

        System.out.println("---contains(key) method---");
        System.out.println(employees.containsKey(70)); //true

        System.out.println(employees.containsKey(100)); //false

        System.out.println("---contains(value) method---");
        System.out.println(employees.containsValue("Nijat"));//true
        System.out.println(employees.containsValue("Nadyr"));//false

        System.out.println("---isEmpty method---");
        System.out.println(employees.isEmpty()); //false
        System.out.println(empMap.isEmpty()); //true

        System.out.println("---keySet() method ---");
        System.out.println("keys: " + employees.keySet());
        Set<Integer> empIds = employees.keySet();
        System.out.println("empIds = " + empIds);

        System.out.println("---values() method---");
        System.out.println(employees.values());

        Collection<String> empNames = employees.values();
        System.out.println("empNames = " + empNames);


    }
}
