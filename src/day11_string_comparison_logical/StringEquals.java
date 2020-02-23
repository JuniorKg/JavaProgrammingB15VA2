package day11_string_comparison_logical;

public class StringEquals   {
    public static void main(String[] args) {
        String str = "java";
        String str2 = new String("java");
        //compare using ==

        System.out.println(str == "java");
        System.out.println(str2 == "java");

        //compare using .equals() method
        System.out.println(str.equals("java")); //true
        System.out.println(str2.equals("java")); //true
        System.out.println(str2.equals("Java")); // false - J and j are different

        // compare using .equalsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("JAVA"));
        System.out.println(str2.equalsIgnoreCase("JAVA"));

        System.out.println(str.equalsIgnoreCase(str2)); //true
        System.out.println(str.equals(str2)); //true

        System.out.println(str == str2); // false. they are created differently

    }
}
