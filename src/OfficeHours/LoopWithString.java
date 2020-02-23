package OfficeHours;

public class LoopWithString {
    public static void main(String[] args) {

          /*
                  String input
                  String chars = "!?,:*&$%.";
                  Check how many chars is in input
                  ex:
                  Hello world!!! -> 3
                  Total price: $5.00 -> 3
               1. Loop through the chars and save each char in variable
                        --> Outer loop
               2. Loop through the the word --> inner loop
               3. Create int count before we enter our loops = 0
               4. If the char we saved(step 1) is found in word -> count++
                 ------
               0. Save the word length
               1. Loop through the chars and save each char in variable
               2. replace all char (saved in step 1) with ""
                        Hello world!!! -> 14
                        after replace
                           Hello world -> 11
               3. find the lenght of result
               Calculate the difference with initial length
                           14-11 = 3
         */
        String chars = "!?,:*&$%.";
        //              012345678
        String word = "Total price: $5.00 ...";
        //             01234567
        // for (int i =0 ; i< chars.length(); i++)
        int index = 0;  //0
        int begLength = word.length(); // 8
        while (index<chars.length()){ // 0 -> 7
            String ch = chars.charAt(index)+""; //ch = ! -> ?
            word = word.replace(ch, ""); //"Hello!!!" - >"Hello"
            index++; // 1
        }
        int endLength = word.length();
        System.out.println("There are " + (begLength-endLength) + " chars in the word");

    }
}