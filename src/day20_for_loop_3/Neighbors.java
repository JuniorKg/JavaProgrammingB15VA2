package day20_for_loop_3;

public class Neighbors {
    public static void main(String[] args) {
        String str = "j va loopps";

        for (int idx = 0; idx < str.length(); idx++) {
            System.out.println(str.charAt(idx) + " " + str.charAt(idx + 1));
            if (str.charAt(idx) == str.charAt(idx + 1)) {
                System.out.println("Beep - " + str.charAt(idx));
            }
        }
    }
}