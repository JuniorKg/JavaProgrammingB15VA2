package day14_string_manipulation;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "selenium";

        System.out.println(word.startsWith("s"));
        System.out.println(word.startsWith("selen"));
        System.out.println(word.startsWith("el"));

        //end with practice

        System.out.println(word.endsWith("m"));
        System.out.println(word.endsWith("um"));
        System.out.println(word.endsWith("nium"));

        //Mr. -> Man
        //Mrs. -> Married Man
        //Ms. -> Single woman
        //Dr. -> Doctor
        //Prof. -> Professor

        String name = "Mr.Omer";

        if (name.startsWith("Mr.")) {
            System.out.println("This is the man's word = " + name);
        } else if (name.startsWith("Mrs.")) {
            System.out.println("Married Woman = " + name);
        } else if (name.startsWith("Ms.")) {
            System.out.println("Single Woman = " + name);
        } else if (name.startsWith("Dr.")) {
            System.out.println("Doctor = " + name);
        } else if (name.startsWith("Prof.")) {
            System.out.println("Professor = " + name);
        }
        //website google.org


        String website = "www.google.com";
        //if website ends with .com -> print "American Site"
        //if website ends with .edu -> print "College Site"
        //if website ends with .gov -> print "Government Site"

        if (website.endsWith(".com")) {
            System.out.println("This is American site " + website);
        } else if (website.endsWith(".edu")) {
            System.out.println("This is College site " + website);
        } else if (website.endsWith(".gov")) {
            System.out.println("This is Government site " + website);
        }
    }
}





