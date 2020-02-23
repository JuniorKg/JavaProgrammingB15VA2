package day38_methods_with_arraylist;
import java.util.*;
import java.util.ArrayList;
public class MethodReturnArrayList {
    public static void main(String[] args) {
        //call getMonths() and print out returned list
        System.out.println(getMonths());
        //call getMonths() and assign returned list into another list then print
        List<String> months = getMonths();
        System.out.println(months);

        for (String eachMonth : months) {
            System.out.println("eachMonth = " + eachMonth);
        }
            getIntList(5);
            System.out.println(getIntList(5));

        for (int i = 1; i <= 200 ; i++) {
            System.out.println(getIntList(i));

        }

        }




    public static List<String> getMonths() {
        List<String> list = new ArrayList<>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");

        return list;
    }

    public static List<Integer> getIntList(int size) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            numbers.add(i);

        }
        return numbers;
    }
}