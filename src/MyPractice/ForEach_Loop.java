package MyPractice;

import java.util.Arrays;

public class ForEach_Loop {
    public static void main(String[] args) {

        String[] fruits = new String[3];

        fruits[0] = "Apples";
        fruits[1] = "PassionF";
        fruits[2] = "Mango";

        for (String each : fruits) {
            System.out.println(each);
        }

        int[] intArray = {1, 2, 4, 5, 7};

        for (int num : intArray) {
            System.out.print(num + " ");
        }

        int[] ints = {2, 4, 6, 8, 12, 12, 123};

        for (int item : ints) {
            if (item % 2 == 0) {
                System.out.println("item = " + item);

            }
        }
            String [] strs = {"Juma", "Aika", "Edil"};

            for (String name : strs){
                if (name.contains("a")) {
                    System.out.println("Names that contains char 'a': " + name);
                }
                }

                for (int i = 0; i < strs.length ; i++) {
                    System.out.println(strs[i]);
                }

                for (String item : strs){
                    item = "aaa";
                    System.out.println(item);
                }
        System.out.println(Arrays.toString(strs));
            }
        }



