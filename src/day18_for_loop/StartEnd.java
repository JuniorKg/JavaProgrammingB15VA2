package day18_for_loop;

public class StartEnd {
    public static void main(String[] args) {
        int start = 60;
        int end = 130;

        for (int n = start; n <= end; n++) {
            System.out.print(n + " ");
        }
        System.out.println();


        for (int n = 10; n >= 0; n--) {
            System.out.print(n + " ");
        }

        System.out.println();



        start = 25;
        end = 30;

        if (start < end) {
            for (int n = start; n <= end; n++) {
                System.out.print(n + " ");
            }
        } else {
            for (int n = start; n >= end; n--) {
                System.out.print(n + " ");
            }
        }
    }
}