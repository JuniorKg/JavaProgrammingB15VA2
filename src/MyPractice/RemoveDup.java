package MyPractice;

public class RemoveDup {
    public static void main(String[] args) {
        System.out.println(removeDub("fdddfffeeedd"));


        /**
         * Write a return method that can remove the duplicated values from String
         *
         * Ex:  removeDup("AAABBBCCC")  ==> ABC
         */

    }

    public static String removeDub(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }
            return result;
        }
    }


