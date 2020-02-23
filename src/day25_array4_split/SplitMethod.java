package day25_array4_split;

public class SplitMethod {
    public static void main(String[] args) {
        //create a string
        String words = "java, ruby, python, c++";
        //Split thr words by "," and assign to String[]
        String [] wordsArray = words.split(",");
        System.out.println("Length of wordsArray : " +wordsArray.length);



    }
}
