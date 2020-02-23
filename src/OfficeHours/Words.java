package OfficeHours;

public class Words {
    public static void main(String[] args) {

        String word1 = "apple";

        String word2 = "APPLE";
        String word3 = "I like apples";

        System.out.println(word1.equals((word2)));
        System.out.println(word1.equalsIgnoreCase(word2));

        //it's gonna be apple
        System.out.println(word3.contains((word2.toLowerCase())));

        //since strings are immutable
        //to change their value
        //we need to reassign new value again

        word2 = word2.toLowerCase();
        System.out.println(word2);
        //if I want to make it all upper case again
        word2 = word2.toUpperCase();
        System.out.println(word2);


    }
}
