package day53_review_poly_intro;

public class MacPro extends AppleDevice implements Codable {

     String model;


    public void usAsServer(){
        System.out.println(name + " is " + model + " model you can use it as server");
    }

    @Override
    public void use() {
        System.out.println(name + " is " + model + " you can do whatever you want");
    }

    @Override
    public void code() {
        System.out.println(name + " is " + model + " you can code on it");

    }
}
