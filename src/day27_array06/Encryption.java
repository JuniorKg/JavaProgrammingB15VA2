package day27_array06;

import javax.crypto.Cipher;

public class Encryption {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String encrypted = "zyxwvutsrqponmlkjihgfedcba";

        String letter = "a";
        //encrypt letter 
        //find the index of letter "a" in alphabet
        int idx = alphabet.indexOf(letter); //0
        //read character at same index from encrypted 
        System.out.println(encrypted.charAt(idx));
        System.out.println(letter + " -> " + encrypted.charAt(idx));

        String word = "java";
        String encWord = "";
        char first = word.charAt(0); //j
        char second = word.charAt(1); //a
        char third = word.charAt(2); //v
        char fourth = word.charAt(3); // a

        int i1 = alphabet.indexOf(first); //9
        int i2 = alphabet.indexOf(second);//0
        int i3 = alphabet.indexOf(third);//22
        int i4 = alphabet.indexOf(fourth);//0

        char encr1 = encrypted.charAt(i1);
        char encr2 = encrypted.charAt(i2);
        char encr3 = encrypted.charAt(i3);
        char encr4 = encrypted.charAt(i4);

        encWord = "" + encr1 + encr2 + encr3 + encr4;
        System.out.println("word = " + word);
        System.out.println("encWord = " + encWord);

        //TASK.2 Assign a new word and encrypt each letter using a for loop

        String word2 = "zhumgalbek";
        String encrypted2 = "";

        for (int i = 0; i < word2.length(); i++) {
            //1.read a letter from word2 - index i
            char myLetter = word2.charAt(i);
            //2. Find the index of my letter in alphabet
            int index = alphabet.indexOf(myLetter);
            //3. Read the letter at position index from encrypted
            char enc = encrypted.charAt(index);
            //4. Add to encrypted word variable
            encrypted2 += enc;
        }

        System.out.println("Encrypted word: " + encrypted2);

         /*
         String word2="hello";
         String encrypted2="";
         for (int i = 0; i <word2.length() ; i++) {
            int idx=alphabet.indexOf(word2.charAt(i));
            char w1=encrypted.charAt(idx);
            encrypted2+=w1;
         }
         System.out.println(word2+" =>"+encrypted2);
          */


    //TASK 3. declare word3 and assign some encrypted message
    //Decrypt it!
    String word3 = "dliow";
     String encrypted3 = "";

        for( int i = 0; i<word3.length();i++)   {
        //1.read a letter from word3 - index i
        char myLetter = word3.charAt(i);
        //2. Find the index of my letter in alphabet
        int index2 = encrypted.indexOf(myLetter);
        //3. Read the letter at position index from encrypted
        char enc = alphabet.charAt(index2);
        //4. Add to encrypted word variable
        encrypted3 += enc;


    }
        System.out.println("Decrypted word: "+ encrypted3);


}

    }