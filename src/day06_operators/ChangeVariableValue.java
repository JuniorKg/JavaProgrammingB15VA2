package day06_operators;
import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ChangeVariableValue {
    public static void main(String[] args) {
        int students = 50;

        System.out.println("Students: " +students);
        students = students +10;
        System.out.println("Students: " +students);
        students = students-2;
        System.out.println("Students: " +students);
        int b12Students =3;
        students = students + b12Students;
        System.out.println("Students: " +students);

        double balance = 250.0;
        double shoesPrice = 75.5;

        System.out.println("Balance: " + balance);
        balance = balance - shoesPrice;
        System.out.println("Balance: " + balance);

        double socksPrice = 10.99;
        balance = balance-socksPrice;
        System.out.println("Balance: " + balance);

        double shirtPrice = 77.5*2;
        balance = balance - shirtPrice;
        System.out.println("Balance: " +balance);

        double sandwich = 7.99;
        balance = balance - sandwich;
        System.out.println("Balance: " +balance);





    }
}

