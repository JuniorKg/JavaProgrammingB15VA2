package day48_overriding;

public class Wolf extends Animal {
    public void speak (){
        System.out.println("Wolf is howling");
    }

    public void move(){
        System.out.println("Wolf is hunting");
    }
    @Override
    public void eat(String food){
        System.out.println("Wolf is eating " + food + "...");
    }

}
