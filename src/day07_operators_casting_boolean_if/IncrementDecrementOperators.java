package day07_operators_casting_boolean_if;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int myNumber = 100;
        System.out.println("My number: " +myNumber);

        myNumber++;
        System.out.println("My number: " +myNumber);

        ++myNumber;
        System.out.println("My number: " +myNumber);

        myNumber++; myNumber++; myNumber++;

        System.out.println("My number: " + myNumber);


        ++myNumber;
        myNumber++;
        ++myNumber;
        System.out.println("My number: " + myNumber);

        // --
        int booksToRead = 5;
        System.out.println("Book to Read: " + booksToRead); //5

        booksToRead--;
        System.out.println("Book to Read: " + booksToRead); //4

        booksToRead--;
        booksToRead--;
        System.out.println("Book to Read: " + booksToRead); //2

        booksToRead--;
        --booksToRead;
        System.out.println("Book to Read: " + booksToRead); //0


        --booksToRead;
        System.out.println("Book to Read: " + booksToRead); //-1

        char letter = 'A'; // 65 - A
        System.out.println("Letter: " +letter);

        letter++; // 66 - B
        System.out.println("Letter: " +letter);


        letter++;
        letter++;
        System.out.println("Letter: " +letter);

        char myChar = '!';
        System.out.println("My char: " +myChar);

        myChar++;
        System.out.println("My char: " +myChar);

        myChar+=10;
        System.out.println("My char: " +myChar);

    }
}
