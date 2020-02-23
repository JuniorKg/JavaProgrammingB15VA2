package day48_overriding;

public class Horse extends Animal {
    public void speak (){
        System.out.println("Horse says Ia Ia Ia");
    }
    @Override
    public void move(){
        System.out.println("Horse is galloping");
    }

    @Override
    public void eat(String food) {
        System.out.println("Horse is eating " + food + "...");
    }
}
