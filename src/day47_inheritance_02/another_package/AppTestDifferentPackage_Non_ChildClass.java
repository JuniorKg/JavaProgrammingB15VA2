package day47_inheritance_02.another_package;
import day47_inheritance_02.App;
public class AppTestDifferentPackage_Non_ChildClass {
    public static void main(String[] args) {
        App app = new App();
        app.name = "Day one";
        /**
       // app.developer = "Bloom Built Inc"; It is protected. It is visible in the package where
         this class belongs and only SUB-CLASS IN DIFFERENT PACKAGE
       // app.system = "IOS"; It is default. It is visible in the package it belongs
       // app.price = 0.0; It is private. Only visible in the same class
        */

    }
}
