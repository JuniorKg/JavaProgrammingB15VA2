package OfficeHours;

public class AlphabeticChar {
    public static void main(String[] args) {

        /*
        enter alphabetic char check if it is upper case or lower case
         */

        char alphChar = 'T';

        // a - z - lowercase

        // A-Z - uppercase

        if (alphChar >= 'a' && alphChar <= 'z'){
            System.out.println("char is lowercase");
       }else if (alphChar >='A' && alphChar <= 'Z'){
            System.out.println("char is uppercase");
        } else {
            System.out.println("char is not alphabetic");
        }
    }
}
