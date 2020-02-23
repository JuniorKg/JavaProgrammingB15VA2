package day54_polymorphism;

public class ShapeTest {
    public static void main(String[] args) {

        Shape shape = new Shape();

        shape.draw();
        System.out.println("----------------------");

        Diamond diamond = new Diamond();

        diamond.draw();
        System.out.println("----------------------");

        Square square = new Square();

        square.draw();
        System.out.println("----------------------");

        Triangle triangle = new Triangle();

        triangle.draw();
        System.out.println("------- POLYMORPHISM-------");


        //POLYMORPHISM:
        //Object type is sub class

        Shape shape1 = new Square();

        shape1.draw();
        System.out.println("----------------------");

        shape1 = new Triangle();
        shape1.draw();
        System.out.println("----------------------");

        shape1 = new Diamond();
        shape1.draw();
        System.out.println("----------------------");


        System.out.println("--- CALL DRAW METHOD WITHOUT VARIABLE---");
        new Triangle().draw();
        new Diamond().draw();
        new Square().draw();

        System.out.println("Java".toUpperCase());

        //====================================

        System.out.println("------------------------------------");
        //create 4 shapes, using polymorphism

        Object shapeObject = new Shape();
        Shape square1 = new Square();
        Shape diamond1 = new Diamond();
        Shape triangle1 = new Triangle();


        //Diamond dm = new Shape();
        // ERROR, cannot put child reference to a parent type object

        square1.draw();
        System.out.println(("---------------------------"));
        diamond1.draw();
        System.out.println(("---------------------------"));
        triangle1.draw();
        System.out.println(("---------------------------"));

        ((Square) square1).squareMethod();
        square.squareMethod();



    }
}


