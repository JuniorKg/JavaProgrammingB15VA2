package day46_inheritance_intro;

public class Phone extends Device {
    String carrier;

    public void call() {
        System.out.println("call");
    }

    public void text() {
        System.out.println("text");


    }
}

