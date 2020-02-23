package day19_for_loop_2;

public class PrintLetters {
    public static void main(String[] args) {
        String name = "Zhumgalbek";

//        System.out.println(name.charAt(0)); //"Z"
//        System.out.println(name.charAt(1)); //"h"
//
//       int n = 0;
//        System.out.println(name.charAt(n)); //"Z"
//        n++;
//        System.out.println(name.charAt(n));//"h"
//        n++;
//        System.out.println(name.charAt(n)); //u
//        n = 6;
//        System.out.println(name.charAt(n)); //l

        for (int i = 0; i < name.length(); i++) {
            System.out.println(i + ":" + name.charAt(i));
        }

        for (int i = name.length()-1; i >= 0; i--) {
            System.out.print(name.charAt(i));

        }
    }
}