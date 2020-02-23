package day55_polymorphism2;

import com.sun.security.jgss.GSSUtil;
import day54_polymorphism.*;
import org.w3c.dom.ls.LSOutput;

import java.util.*;


public class ShapeManager {



    public static void drawSquare(Square squareObj) {
        System.out.println("Drawing a square");
        squareObj.draw();
    }
     public static void drawShape(Shape shapeObj)   {
         System.out.println("Drawing a shape - " + shapeObj.type +"....");
         shapeObj.draw();
    }
    public static void drawShapeFormObject(Object object) {
        System.out.println("Drawing shape from object...");
        System.out.println(object.getClass().getSimpleName());
    }

    public static void drawShape(List<Shape> shapeList) {
        for (int i = 0; i < shapeList.size(); i++) {
            System.out.println("Drawing a shape " + shapeList.get(i).type + "....");
            shapeList.get(i).draw();

        }
    }
//        System.out.println("Drawing a shape - " + shapeObj.type +"....");
//        shapeObj.draw();

        public static Shape buildShape(String type){
        Shape retShape = null;
            System.out.println("Here is the shape " + type + "...");
            if (type.equals("Square")){
                retShape = new Square();
               } else if (type.equalsIgnoreCase("Triangle")){
                retShape = new Triangle();
            } else if (type.equalsIgnoreCase("Diamond")){
                retShape = new Diamond();
            } else if (type.equalsIgnoreCase("Shape")){
                retShape = new Shape();
            }
            return retShape;



    }
}
