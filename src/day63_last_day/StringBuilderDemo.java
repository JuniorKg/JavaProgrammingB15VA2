package day63_last_day;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String str = "java";
        str = str + ", selenium";

        /**
         * java, Selenium java, Selenium
         */

        System.out.println("str = " + str);
        StringBuilder stb = new StringBuilder("java");
        stb.append(",selenium");
        System.out.println("stb: " + stb);
        stb.append(",git").append(",github");
        System.out.println("stb: " + stb);

        StringBuffer stbf = new StringBuffer("java");
        stbf.append(",html").append(",git");
        stbf.reverse();
        System.out.println(stbf);

        String checkStr = "civic";
        StringBuilder stringBuilder = new StringBuilder(checkStr);
        stringBuilder.reverse();
        if (stringBuilder.toString().equalsIgnoreCase(checkStr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println(isPalindrome("mom"));
        System.out.println(isPalindrome("nursesrun"));
        System.out.println(isPalindrome("dad"));
        System.out.println(isPalindrome("racecar"));
    }
        public static boolean isPalindrome(String word){
        return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);



    }
}
