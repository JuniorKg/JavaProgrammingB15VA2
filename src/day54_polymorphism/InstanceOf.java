package day54_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class InstanceOf {
    public static void main(String[] args) {

        Shape diamond = new Diamond();
        System.out.println(diamond.getClass().getSimpleName());

        Shape shape = new Square();
        System.out.println("Shape is referring to object of " + shape.getClass().getSimpleName());

        if (shape.getClass().getSimpleName().equalsIgnoreCase("square")) {
            System.out.println("It is object of Square class");
        }

        //instance of operator

        if (shape instanceof Square) {
            System.out.println("Square object");
        } else if (shape instanceof Diamond) {
            System.out.println("Diamond object");
        }

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());
        shapeList.add(new Shape());
        shapeList.add(new Square());
        shapeList.add(new Diamond());
        shapeList.add(new Triangle());

        int shapeCount = 0, triangleCount = 0, squareCount = 0, diamondCount = 0;

        for (int i = 0; i < shapeList.size(); i++) {
            if (shapeList.get(i) instanceof Square) {
                squareCount++;
            } else if (shapeList.get(i) instanceof Diamond) {
                diamondCount++;
            } else if (shapeList.get(i) instanceof Triangle) {
                triangleCount++;
            } else if (shapeList.get(i) instanceof Shape) {
                shapeCount++;
            }
        }

        System.out.println("Square counts is " + squareCount);
        System.out.println("Diamond counts is " + diamondCount);
        System.out.println("Triangle counts is " + triangleCount);
        System.out.println("Shape counts is " + shapeCount);

        System.out.println("---------------------------------");
        for (Shape eachShape : shapeList) {
            if (eachShape.getClass().getSimpleName().equals("Triangle")){
                triangleCount++;
            }else if (eachShape.getClass().getSimpleName().equals("Diamond")){
                diamondCount++;
            }else if (eachShape.getClass().getSimpleName().equals("Square")){
                squareCount++;
            }else if (eachShape.getClass().getSimpleName().equals("Shape")){
                shapeCount++;
            }
        }
        System.out.println("shapeCount = " + shapeCount);
        System.out.println("triangleCount = " + triangleCount);
        System.out.println("squareCount = " + squareCount);
        System.out.println("diamondCount = " + diamondCount);
    }
}

