package day55_polymorphism2;

import day54_polymorphism.*;
import java.util.*;
import static day55_polymorphism2.ShapeManager.*;

public class ShapeActions {
    public static void main(String[] args) {
        Square mySquare = new Square();
        ShapeManager.drawSquare(mySquare); // need a square object
        ShapeManager.drawSquare(new Square());

        //pollymorp declare and assign 4 objects

        Shape myShape = new Shape();
        Shape myDiamond = new Diamond();
        Shape myTriangle = new Triangle();
        Shape yourShape = new Shape();

        ShapeManager.drawShape(myShape);//options : object of Shape, Square, Triangle, Diamond
        ShapeManager.drawShape(myDiamond);
        ShapeManager.drawShape(myTriangle);
        ShapeManager.drawShape(yourShape);

        System.out.println("=========================");
        ShapeManager.drawShape(new Shape());//options : object of Shape, Square, Triangle, Diamond
        ShapeManager.drawShape(new Diamond());
        ShapeManager.drawShape(new Triangle());
        ShapeManager.drawShape(new Shape());


        System.out.println("----OBJECT PARAMETER----");
        ShapeManager.drawShapeFormObject("java");
        ShapeManager.drawShapeFormObject(123);
        ShapeManager.drawShapeFormObject(true);

        Object object = new Random();
        System.out.println(object.toString());


        //case to Randon and call nextInt
        int num = ((Random) object).nextInt(11);
        System.out.println("num = " + num);


        //downcast from Object to Random and assign to variable
        Random rand = (Random) object;
        System.out.println(rand.nextInt(5));

        System.out.println("---METHOD WITH LIST <SHAPE>----");
        List<Shape> myList = new ArrayList<>();
        myList.add(new Shape());
        myList.add(new Shape());
        myList.add(new Diamond());
        myList.add(new Diamond());
        myList.add(new Square());
        myList.add(new Square());
        myList.add(new Triangle());
        myList.add(new Triangle());

        ShapeManager.drawShape(myList);

        Shape sh1 = ShapeManager.buildShape("Diamond");
        sh1.draw();

        buildShape("Triangle");
        buildShape("Triangle").draw();

        Shape tr = buildShape("triangle");
        tr.draw();


    }





}
