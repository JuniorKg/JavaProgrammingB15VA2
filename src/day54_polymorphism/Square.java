package day54_polymorphism;

public class Square extends Shape {
    public Square() {
        type = "square";
    }

    public void draw(){

        for(int i = 0; i <4; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }

    public void squareMethod(){
        System.out.println("Square method");
    }

}
