package day36_wrapper_arraylist;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList myFirstList = new ArrayList();
        //assign values using add method
        myFirstList.add("java");
        myFirstList.add("javascript");
        myFirstList.add("python");
        myFirstList.add("repl.it");
        myFirstList.add(1200);
        myFirstList.add(34.5);
        myFirstList.add(true);

        System.out.println(myFirstList);

    }
}