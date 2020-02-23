package day15_string_manipulation;

public class StringReplace {
    public static void main(String [] args){
      String words = "sad, cry, python";
        System.out.println(words.replace("sad" , "happy"));
        System.out.println(words.replace("cry" , "smile"));
        System.out.println(words.replace("python", "java"));


        words = words.replace("sad", "happy");
        words = words.replace("cry", "smile");
        words = words.replace("python", "java");

        System.out.println(words);


        words = words.replace("sad, cry, python" , "happy, smile, java");
        System.out.println("words = " + words);


        // change "smile" to "SMILE"

        words = words.replace("smile" , "SMILE" );
        System.out.println("words = " + words);
        
        words = words.replace(", " , "|");
        System.out.println("words = " + words);
        
        String capital = "London is capital of Great Britain";
        capital = capital.replace("London", "Bishkek");
        capital = capital.replace("Great Britain" , "Kyrgyzstan");
        System.out.println("capital = " + capital);

        capital = capital.replace("Bishkek", "Washington DC")
                .replace("Kyrgyzstan" , "US");

        System.out.println("capital = " + capital);
        

















    }
}
