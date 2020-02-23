package day54_polymorphism;

public class Shape {
    public String type;
    public Shape() {
        type = "shape";
    }
      public void draw(){
          System.out.println(type + "**********");
          type = "draw";
        }
    }

