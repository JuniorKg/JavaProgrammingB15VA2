package day53_review_poly_intro;

public class Iphone extends AppleDevice implements Wearable, Codable {

    String model;

    public void navigation(){
        System.out.println("You can navigate");
    }

    @Override
    public void use() {
        System.out.println(name + " model "+ model + " is used to make a call and etc");

    }

    @Override
    public void code() {
        System.out.println(name + " model " + model + " is used to code in repl.it and coding bat and notes");

    }

    @Override
    public void wear() {
        System.out.println(name + " model " + model + " - wearing on arm using case.");

    }
}
