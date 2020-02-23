package day17_while_do_while_loop;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
        //   letter++;
        // System.out.println("letter = " + letter);

        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }

        System.out.println();




            char reversed = 'z';
            while (reversed >= 'a'){
            System.out.print(reversed + " ");
            reversed--;
        }

            char myLetter = 'A';
            String alphabet = "";

            while(myLetter <= 'Z'){
                alphabet+= myLetter; // also alphabet = alphabet + myLetter;
                System.out.println(alphabet);
                myLetter++;


            }




        //print alphabet in reverse
    }
}