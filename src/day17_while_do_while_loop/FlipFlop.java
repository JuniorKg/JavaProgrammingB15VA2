package day17_while_do_while_loop;
import java.util.Scanner;
public class FlipFlop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String words = scan.nextLine();
        String word = "Wooden Spoon";


        word.indexOf(" ");
        
        int spaceIdx = word.indexOf(" ");
        System.out.println(word.substring(0, spaceIdx));
        System.out.println(word.substring(spaceIdx+1));

        String word1 = word.substring(0, spaceIdx).toUpperCase();
        String word2 = word.substring(spaceIdx+1).toUpperCase();

        System.out.println(word2+" " +word1);

       String newWord = word2+" "+word1;








    }
}
