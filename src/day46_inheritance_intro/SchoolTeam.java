package day46_inheritance_intro;

public class SchoolTeam {
    public static void main(String[] args) {
        Person marufjon = new Person();
        marufjon.name = "Marufjon";
        marufjon.age = 22;
        marufjon.gender = 'M';

        Student nadyr = new Student();
        nadyr.name = "Nadyr";
        nadyr.age = 30;
        nadyr.gender = 'M';
        nadyr.course = "SDLC vs STLC";

        marufjon.walk();
        nadyr.walk();

        nadyr.speak();
        marufjon.speak();

        Employee kiki = new Employee();
        kiki.name = "Kiki";
        kiki.age = 25;
        kiki.gender = 'F';

        kiki.walk();
        kiki.speak();

        kiki.work();

        marufjon.eat("pasta");
        nadyr.eat("shish tavuk");
        kiki.eat("farmers salad");




    }
}
