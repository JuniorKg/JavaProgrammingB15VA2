package day19_for_loop_2;

public class CountHowMany {
    public static void main(String[] args) {
        /*
        String str = "java loops is fun";
        how many letter 'a'?
        2
        how many letter ' '?
        3
        how many letter 'v'?
        1
        how many letter 'w'?
        0
        Collapse
         */

        String str = "java loops are fun";

        int count = 0;
        char myChar = 'a';

        //loop from first until last letter
        // compare if it is equal myChar
        //if true increase count by 1
        //After loop print "Count: 3"

        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
            if (str.charAt(i) == myChar) {
                count++;
                System.out.println(myChar + " found at " + i);
            }

            System.out.println();
        }

    }

}