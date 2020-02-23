package day36_wrapper_arraylist;

public class ExtractNumbersFromString {
    public static void main(String[] args) {

        System.out.println(getAllNumbers("java100isfun+1"));
       // System.out.println(getAllNumbers2("sdgdsgs$%^#1213##fg"));

        String str = "java123is45fun0";

        //Print all numbers from str


        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }

        //declare 2 String variables;
        //String letters = "";
        //String numbers = "";
        //Store all letter and numbers to above variables and print out

        String letter = "";
        String numbers = "";
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (Character.isLetter(temp)) {
                letter += temp;
            } else if (Character.isDigit(str.charAt(i))) {
                numbers += temp;


            }
        }
        System.out.println("Letters: " + letter);
        System.out.println("Numbers: " + numbers);
    }

    public static Integer getAllNumbers(String str) {
        String numbers = "";
        for (int n = 0; n < str.length(); n++) {
            if (Character.isDigit(str.charAt(n))) {
                numbers += str.charAt(n);
            }
        }
        //convert String to Integer wrapper
        if (numbers.isEmpty()) {
            return 0;
        } else {
            return Integer.valueOf(numbers);
        }
    }
}



//        public static Integer getAllNumbers2 (String strNum){
//            if (strNum.replaceAll("[^0-9]", "").isEmpty()) return 0;
//            return Integer.parseInt(strNum.replaceAll("[^0-9]", ""));










