package day48_overriding;

public class Cat extends Animal {
        public void speak(){
            System.out.println("Cat is saying MEOW MEOW");
        }

        public void move(){
            System.out.println("Cat is moving elegantly");
        }

    @Override
    public void eat(String food) {
        System.out.println("Cat is eating " + food + "...");
    }
}
