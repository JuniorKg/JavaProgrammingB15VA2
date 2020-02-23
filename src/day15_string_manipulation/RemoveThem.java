package day15_string_manipulation;

public class RemoveThem {
    public static void main(String[] args) {
        String sentence = "Java is fun"; // JavaisFun
        
        // " " -> ""
        
        String withNoSpaces =  sentence.replace(" ", "");
        System.out.println("withNoSpaces = " + withNoSpaces);
        
        //remove "is" 

        withNoSpaces = sentence.replace(" is ", "");
        System.out.println("withNoSpaces = " + withNoSpaces);
        
        String etsyResult = "Iphone case (212,713 Results)";

        etsyResult = etsyResult.replace("Iphone case (" ,  "");
        etsyResult = etsyResult.replace(",", "");
        etsyResult = etsyResult.replace(" Results)" , "");
        System.out.println("etsyResult = " + etsyResult);
        
        String mixed = "!@J#$A%^VA*(";
        
        mixed = mixed.replace("!@" , "")
                .replace("#$" , "")
                .replace("%^" , "")
                .replace("*(" , "");
        System.out.println("mixed = " + mixed);

        
                


    }
}

