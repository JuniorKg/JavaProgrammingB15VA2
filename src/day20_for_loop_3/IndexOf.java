package day20_for_loop_3;

public class IndexOf {
    public static void main(String[] args) {
        String word = "Java is fun";
        // lets not convert to lowercase;
        char letter = 'q'; // we will look for this letter in the word
        int n = word.indexOf('a');
        int index = -1; // position  of a letter - assume not there and assign -1
        // loop from first character until last
        for (int i = 0; i < word.length(); i++) {
            //  System.out.println(word.charAt(i));
            if (word.charAt(i) == letter) {
                index = i;
                break;
                // System.out.println(letter + " found at " + i);
            }
        }
            System.out.println(letter + " was found at index # " + index);
        }
    }
