package day17_while_do_while_loop;

public class CountWhileLoop {
    public static void main(String[] args) throws Exception {

        int counter = 1;


        while (counter <= 10) {
            System.out.print(counter + " ");
            counter++;
            Thread.sleep(300);
        }

        System.out.println(); // go to new line

        int counter2 = 10;

        while (counter2 >= 1) {
            System.out.print(counter2 + " ");
            counter2--;
            Thread.sleep(200);
        }

        }
    }