package day21_forloop_4_arrayintro;
import java.util.*;
public class PrintStarsColRow {
    public static void main(String[] args) {
        Random rdn = new Random();

        int rows = rdn.nextInt(12)+1;
        int column = rdn.nextInt(23)+1;

        for (int r = 1; r <= rows; r++){
            for (int c = 1; c <= column; c++){
                System.out.print("* ");
            }
            System.out.println();
        }


        }

//        Thread.sleep(1);
//        main(null);

    }

