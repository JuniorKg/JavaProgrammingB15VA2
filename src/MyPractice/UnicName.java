package MyPractice;


import java.util.*;
public class UnicName {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Juma", "Aika", "Edil", "Juma", "Aika", "Tom"));

        //Remove duplicate

        String str = "";

        for (int i = 0; i < names.size() ; i++) {
            int count = 0;
            for (int j = 0; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j)))
                    count++;
            }

            if (count == 1) {
                str += names.get(i) + " ";

            }
        }
            System.out.println(str);
        }

    }
