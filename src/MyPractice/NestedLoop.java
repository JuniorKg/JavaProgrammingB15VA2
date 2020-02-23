package MyPractice;

import java.util.Arrays;

public class NestedLoop {
    public static void main(String[] args) {

        int [] rows = {1,2,3,4};
        int [] cols = {1,2,3};

        for (int row : rows ){
            for (int col : cols){
                System.out.print(" |Row"+row+"-Column"+col);
            }
            System.out.println(    );
        }

        int [] students = {1,2,3,4};
        String [] names = {"Juma", "Edil", "Aika", "Tahmina"};
        Arrays.sort(names);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

        for (int eachst : students){
            for (String eachname: names){
                System.out.print(" |Student" + eachst+"-Name: " +eachname);
            }


        }
    }
}
