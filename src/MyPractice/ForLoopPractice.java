package MyPractice;

public class ForLoopPractice {
    public static void main(String[] args) {

        String [] fruits = new String [3];
        fruits[0] = "apples";
        fruits[1] = "pears";
        fruits[2] = "oranges";

        String allFruits = "";
        for (int a = 0; a < 3; a++) {
            allFruits += fruits[a] + " ";
            System.out.print(fruits[a] + ", ");
        }
        System.out.println();
            allFruits = allFruits.substring(0, allFruits.length()-1);
            System.out.println(allFruits);
            }
        }


