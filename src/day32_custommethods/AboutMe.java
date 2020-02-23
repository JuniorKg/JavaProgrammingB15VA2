package day32_custommethods;

public class AboutMe {
    public static void main(String[] args) {
       myName();
       morning();
       code();

    }
    public static void myName(){
        String name = "Juma";
        System.out.println("My name is: " +name);

    }
    public static void morning(){
        System.out.println("I wake up at 7 am");
        System.out.println("I have my breakfast");
        System.out.println("Goto School");
    }
    public  static void code(){
        System.out.println("I code in Java");
        System.out.println("I like Java");

    }
}

