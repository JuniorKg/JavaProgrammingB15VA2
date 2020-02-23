package day21_forloop_4_arrayintro;

public class NestedLoop1 {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 5; outer++) {
            for (int inner = 0; inner <= 9; inner++) {
                System.out.print(inner + "");
            }
            System.out.println();
        }

        /*
        0
        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
         */

        for(int outer = 0; outer<=9; outer++){
            for(int inner = 0; inner<=outer; inner++){
                System.out.print(inner + "");
            }
            System.out.println();
        }

        for(int outer = 8; outer>=0; outer--){
            for(int inner = 0; inner<=outer; inner++){
                System.out.print(inner + "");
            }
            System.out.println();
    }
}
    }