package day42_encapsulation;

public class People {
    public static void main(String[] args) {
        Person p1 = new Person();
       // p1.name = ""; ERROR : Name is private
       // p1.age = -22; ERROR : Age is private
        System.out.println(p1.toString());
        System.out.println("------------------");
        p1.setName("Juma");

        System.out.println(p1.toString());
        System.out.println("-------------------------");
        System.out.println(p1.getName());

    }
}
