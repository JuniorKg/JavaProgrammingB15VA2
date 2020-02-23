package MyPractice.AhmedLecture;

public class Animal {
    public String name;
    static String color; //static variable also means class variable
    protected int age;
    private int size;
    Integer weight; //null. Objects have "null" value by default
    double weight22; //0.0 by a default

    static{
        color();
        }

    public Animal (String name, String color, int age, int size){
        this.name = name;
        this.color = color;
        this.age = age;
        this.size = size;


    }

    public void eat(){
        String food; //Local variables dont get default values
        System.out.println(name + " is eating and its color " +color + " and its size is " + size);
    }

    public static void color(){
        System.out.println("Animals color is  " + color);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                '}';

    }
}
