package OfficeHours;

public class LoopPractice {
    public static void main(String[] args) {

        /*
                String input
                - print True if word has 2 same characters
                next to each other
                -print false otherwise
              1. look for the statements that have to run more than once
              2. we should have condition for the loop - eventually it
                will stop executing
              3. we should have increment/decrement that will change our
                condition
         */
                String word = "Java";
                //             01234
                boolean found = false; // flag - we will change to true if 2 same chars
                //are found
                for (int i =0; i<word.length()-1; i++    ){
                    char ch1 = word.charAt(i);
                    if (ch1 == word.charAt(i+1)){
                        found = true;
                        break;
                    }
                    //System.out.println(ch1 == word.charAt(i+1)); -- another way of doing this
                    // not good - will print as long as loop runs
                }
                System.out.println(found);
///StringIndexOutOfBoundsException => our index is not within bounds of our length
                // no such index (-1; > length()-1)
            }
        }