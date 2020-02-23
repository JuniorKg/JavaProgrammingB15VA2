package day59_exceptions_collection1;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList();
        List <String> linkedlist2 = new LinkedList<>();

        linkedlist2.add("java");
        linkedlist2.add("python");
        linkedlist2.add("c#");
        linkedlist2.add("c++");
        linkedlist2.add("html");
        linkedlist2.add("javaScript");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.getFirst());

        System.out.println(linkedList.getLast());
        System.out.println(linkedList.toString());

        for (String each: linkedList){
            System.out.println("each: " + each);
        }


    }
}
