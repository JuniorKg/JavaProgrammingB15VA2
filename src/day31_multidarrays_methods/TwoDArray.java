package day31_multidarrays_methods;
import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        //declare 2 D String Array List
        String[][] list = new String[4][3];
        //add vegetables
        list[0][0] = "Potatoes";
        list[0][1] = "Carrots";
        list[0][2] = "Onions";

        //add fruits
        list[1][0] = "Apples";
        list[1][1] = "Kiwis";
        list[1][2] = "Figs";

        //add dairy
        list[2][0] = "Mikl";
        list[2][1] = "Eggs";
        list[2][2] = "Cheese";

        // add bakery

        list[3][0] = "Bread";
        list[3][1] = "Bagel";
        list[3][2] = "Muffin";

        System.out.println(list[0][0] + "," + list[0][1] + "," + list[0][2]);
        System.out.println(list[1][0] + "," + list[1][1] + "," + list[1][2]);
        System.out.println(list[2][0] + "," + list[2][1] + "," + list[2][2]);
        System.out.println(list[3][0] + "," + list[3][1] + "," + list[3][2]);

        System.out.println(Arrays.deepToString(list));

        String fruit = list[1][1];
        System.out.println(" My favorite fruit: " + fruit);

        //Lets find out how many arrays in  the 2D array
        System.out.println("Number of arrays/rows: " + list.length);
        //how many vegetables
        System.out.println("Number of vegetables: " + list[0].length);
        System.out.println("Number of fruits: " + list[1].length);
        System.out.println("Number of dairy: " + list[2].length);
        System.out.println("Number of Bakery: " + list[3].length);

        //How to print using a loop
        //print all vegetables using a loop

        for (int i = 0; i < list[0].length; i++) {
            System.out.println(list[0][i]);
        }
        //Print all bakery
        for (int i = 0; i < list[3].length; i++) {
            System.out.println(list[3][i]);

            for (String items : list[2]) {
                System.out.println(items);

                // String[][] list = new String[4][3] ; rows - -4. column - 3
                //Print all items using nested loop
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println("Row: " + i);
            for (int j = 0; j < list[i].length; j++) {
                System.out.print ("Col: " + j + "-");
                System.out.print(list[i][j]);

            }

        }
    }


}