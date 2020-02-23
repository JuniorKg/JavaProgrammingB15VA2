package day16_memory_while_loop_intro;

public class WhileLoopIntro {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 10){
            System.out.println("Hello World!");
            num++;




            int steps = 1;


            while (steps <=100){
                System.out.println("Taking a " +steps +" steps");
                steps++;
            }
            System.out.println("steps = " +steps);
        }
    }
}
