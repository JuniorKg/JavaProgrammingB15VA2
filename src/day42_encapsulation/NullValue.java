package day42_encapsulation;

import java.util.ArrayList;

public class NullValue {
    String inStr; //inStr = null; <- by default
    int numberOfDays; //0
    ArrayList<Integer> myList; // also null
    public static void main(String[] args) {
        int n;
        String localStr; // does not get any dault value like null
        //System.out.println(localStr); // <--- ERROR. Not initialized
        //System.out.println(n); // <--- ERROR. Not initialized

        String myString = null;
        System.out.println("myString = " + myString);//null
        System.out.println(myString.length());


    }
}