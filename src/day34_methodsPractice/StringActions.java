package day34_methodsPractice;

public class StringActions {
    public static void main(String[] args) {
        int num = countWords("Java  is fun");
        System.out.println("num = " + num);
        
     //******************************************
        int count = countChars("Alexaa", 'a');
        System.out.println("count = " + count);

     //********************************************
        // call countOfChars and save return value into variable
        int countOfChars = countChars("String value", 'v');
        System.out.println("countOfChars = " + countOfChars);
    }


    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0;
        }
        String[] array = sentence.split(" ");
        return array.length;
    }

    public static int countChars(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
            return count;

        }
    }
