package day43_constructor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.*;
public class ComputersList {
    public static void main(String[] args) {
        //Declare List of Computers
        List <Computer> compList = new ArrayList<>();
        compList.add(new Computer("HP 14", "Windows10", 299.99));
        Computer c = new Computer ("Dell Inspiron", "Win11", 419.99);
        compList.add(c);

        compList.add(new Computer("Sony VIAO", "Windows12", 919.99));
        compList.add(new Computer("HP 25", "Windows 7", 299.99));
        compList.add(new Computer("MacbookPro 13", "OS - Catalina", 1819.99));
        compList.add(new Computer("Lenovo 44", "Windows12", 2019.99));

        //TASK 1. Print number of computers
        System.out.println("Number of computers: " + compList.size() );

        //TASK 2. Print first computer brand and price
        System.out.println("First computer: " + compList.get(0).getBrand() +" and price "+ compList.get(2).getPrice());

        //TASK 3. Using For loop. Print number then Computer description

        for (int i = 0; i < compList.size(); i++) {
            System.out.println(i+1 + " " + compList.get(i));

        }

        //TASK 4. Using for each loop. Print number then Computer Description
        int count = 0;
        for (Computer each: compList) {
            count++;
            System.out.println(count +". " + each.toString());
        }

        //TASK 5. Print Brand and Price for computers within your budget
        double myBudget = 800.0;

        for (int i = 0; i < compList.size(); i++) {
            if (compList.get(i).getPrice() <= myBudget) {
                System.out.println(compList.get(i).getBrand() +" - " + compList.get(i).getPrice());
            }
        }
            double myBudget2 = 800.00;
            for(Computer eachComp: compList){
                if(eachComp.getPrice()<=myBudget2){
                    System.out.println(eachComp.getBrand() +" | "+ eachComp.getPrice());
                }
            }

            //TASK 6. Calculate Total price For all computers
        int total = 0;
        for (int i = 0; i < compList.size() ; i++) {
            total+= compList.get(i).getPrice();
        }
        System.out.println("Total price: " + total);


         //Print 7. Print information of most expensive one

//        int max =0;

//        for (int i = 0; i < compList.size(); i++) {
//            if (compList.get(i).getPrice() < max) {
//                max += compList.get(i).getPrice();
//            }
//        }
//            System.out.println("The most expensive one: " + max);


        }


        }



