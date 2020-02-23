package day16_memory_while_loop_intro;

public class StringPool {
    public static void main(String[] args) {
        String word1 = "java"; // It is in String POol
        String word2 = "java"; // String Pool, reuse
        String word3 = new String ("java"); // outside pool, in heap

        System.out.println(word1 == word2); // True. both are pointing to the same object in pool
        System.out.println(word1 == word3); // False. Words3 placed outside of the pool ( they are pointing
        //to different objects in heap. When we use ==, it does not check if values are matching/
        //it only checks if variables are pointing at same object in memory.

        String word4 = new String ("java"); //outside of pool. heap
        //check if word3 and word4 are pointing at the same object
        System.out.println(word3==word4); // false. different object in memory

        String word5 = word4; // points the same object in the HEAP that word4 points at

        System.out.println(word1 ==word4); //false. different object in memory

        System.out.println(word1.equals(word4)); // true. values match "java"

        String str = "macbook"; //string pool in the HEAP
        String str2 = "macbook"; //re-use "macbook" in pool
        String str3 = str; // re-use // points the same object as str








    }

}
