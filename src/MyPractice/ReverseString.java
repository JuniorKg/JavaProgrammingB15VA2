package MyPractice;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Juma"));
    }

    public static String reverse(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0; i-- ){
            result+= str.charAt(i);
        }
        return result;
    }
}
