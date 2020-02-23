package day36_wrapper_arraylist;

public class CharacterWrapper {
    public static void main(String[] args) {
        char ch1 = 'a';
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isLowerCase(ch1));
        System.out.println(Character.isAlphabetic(ch1));

        char ch2 = '5';
        System.out.println(Character.isDigit(ch2));
        System.out.println(Character.isLetterOrDigit(ch2));
        System.out.println(Character.isLetter(ch2));

        char ch3 = '%';

        System.out.println(Character.isDigit(ch3));
        System.out.println(Character.isLetter(ch3));
        System.out.println(Character.isLetterOrDigit(ch3));
        System.out.println(!Character.isLetterOrDigit(ch3));

        char ch4 = ' ';

        System.out.println(Character.isWhitespace(ch4));
        System.out.println(Character.isSpaceChar(ch4));

        String firstName = "John";
        //Test if first name starts with Uppercase letter

        if (Character.isUpperCase(firstName.charAt(0))){
            System.out.println("PASS: first name starts with uppercase");
        } else {
            System.out.println("FAIL: first name does not start with uppercase");
        }
    }
}
