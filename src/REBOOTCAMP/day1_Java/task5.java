package REBOOTCAMP.day1_Java;

/**
 * Create a program that will take any String and print the total sum of all the number in the String.
 * Note: numbers can be more than digits from 1-9 so if you have "14"
 * next to each other it should be considered 14 and not 1 and 4 separate
 *
 * Ex:
 *
 * Intput "java45ai15sgre1at82"
 * Output : (45+15+1+82) = 143
 */
public class task5 {
    public static void main(String[] args) {


        String str = "java45ai15sgre1at82";
        int sum = 0;
        String num = ""; //4

        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                num += str.charAt(i);
                if (i == str.length()-1 || !Character.isDigit(str.charAt(i+1))){
                    sum+= Integer.parseInt(num);
                    num = "";
                }
            }
        }
        System.out.println(sum);
    }
}