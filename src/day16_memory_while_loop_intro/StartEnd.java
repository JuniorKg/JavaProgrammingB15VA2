package day16_memory_while_loop_intro;

public class StartEnd {
    public static void main(String[] args) {


        String str = "I am a [java] programmer";

       // "I am [python] programmer";

        // "I wrote a [100] lines of code today"

        // "today [is] java class"

        System.out.println(str.substring(8, 12));

        String str1 = "I do lots of [javascript] programming for living";
        //System.out.println(str.substring(8, 12));
        int start = str1.indexOf("[");
        int end = str1.indexOf("]");
        System.out.println(str1.substring(start+1, end));
    }
}
