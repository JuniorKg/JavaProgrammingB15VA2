package day54_polymorphism;
import java.util.*;
public class ShapeCollection {
    public static void main(String[] args) {


        /**
         * Declare array that can store 2 square
         */

        Square[] squaresArr = new Square[2];

        squaresArr[0] = new Square();
        squaresArr[1] = new Square();

        squaresArr[0].draw();
        squaresArr[1].draw();


        Shape[] shapeArr = new Shape[4];
        shapeArr[0] = new Shape();
        shapeArr[1] = new Square();
        shapeArr[2] = new Triangle();
        shapeArr[3] = new Diamond();


        shapeArr[0].draw();

        for (int i = 0; i < shapeArr.length; i++) {
            shapeArr[i].draw();
        }

        for (Shape eachShape : shapeArr){
            eachShape.draw();


            //Shape array with polymorphism

            Shape[] shapesArr = new Shape[4];

            shapesArr[0] = new Shape();
            shapesArr[1] = new Square();
            shapesArr[2] = new Triangle();
            shapesArr[3] = new Diamond();

            for (int i = 0; i < shapesArr.length ; i++) {
                shapesArr[i].draw();

            }


            List<Square>  squareList = new ArrayList<>();

            squareList.add(new Square());
            squareList.add(new Square());

            squareList.get(0).draw();
            squareList.get(1).draw();


            List<Triangle>trList = new ArrayList<>();
            trList.add(new Triangle());
            trList.add(new Triangle());

            trList.get(0).draw();
            trList.get(1).draw();

            List<Shape> shapeList = new ArrayList<>();
            shapeList.add(new Shape());
            shapeList.add(new Square());
            shapeList.add(new Diamond());
            shapeList.add(new Triangle());

            for (int i = 0; i < shapeList.size(); i++){
                shapeList.get(i).draw();
            }

            for (Shape eachShape1 : shapeList){
                eachShape1.draw();
            }





        }

    }
}