package day34_methodsPractice;

import java.sql.SQLOutput;

public class FormatString {
    public static void main(String[] args) {
        String results = "About 1,250,000,000 results (0.83 seconds)";
        long pythonResults = getNumberOfGoogleSearchResults("About 529,000,000 results (0.80 seconds");
        System.out.println("pythonResults = " + pythonResults);

        repeatString("Java", 3, '%');

        System.out.println(repeatReturnString("cats are funny", 5, '!'));
    }

    public static long getNumberOfGoogleSearchResults(String searchResults) {

        String countofRs = searchResults.split(" ")[1]; // split and get index 1
        // System.out.println("countofRs = " + countofRs);

        countofRs = countofRs.replace(",", "");
        // System.out.println("countofRs = " + countofRs);

        long count = Long.parseLong(countofRs); //converting string numbers into long
        // System.out.println("count in Long format (convertation is successful) = " + count);
        return count;


    }

    public static void repeatString(String word, int times, char delimiter) {

        for (int i = 0; i < times; i++) {
            System.out.print(word + delimiter);

        }
        System.out.println();
    }

    public static String repeatReturnString (String word, int times, char delimiter) {
        String retVal = "";
        for (int i = 0; i < times; i++) {
            retVal += word + delimiter;



        }
        return retVal;
    }
}


