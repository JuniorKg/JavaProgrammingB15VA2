package day48_overriding;

public class AnimalFriends {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        animal.speak();


        Cat cat = new Cat();
        cat.move();
        cat.speak();


        Horse horse = new Horse();
        horse.move();
        horse.speak();

        Wolf wolf = new Wolf();
        wolf.move();
        wolf.speak();

        animal.eat("apples");
        cat.eat("fish");
        horse.eat("Hay with carrots");
        wolf.eat(" [sheep meat]");




        }

    }

