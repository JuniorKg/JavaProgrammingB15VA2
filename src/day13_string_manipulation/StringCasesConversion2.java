package day13_string_manipulation;

public class StringCasesConversion2 {
    public static void main(String[] args) {
        String word = "Cybertek School";
        //print the word in all uppercase

        System.out.println(word.toUpperCase());
        
        String uWord = word.toUpperCase();
        System.out.println("uWord = " + uWord);
        System.out.println("word = " + word);
        
        String lword = word.toLowerCase();
        System.out.println("lword = " + lword);

        if(lword.equals("cybertek school")) {
            System.out.println(lword + " is all lowercase");
        } else {
            System.out.println(lword +" is not all lowercase or does not match");
        }
        
    }
}
