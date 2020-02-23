package day37_arraylist;
import java.util.*;
public class TeamMates {
    public static void main(String[] args) {
        ArrayList<String> teamMates = new ArrayList<>();

        teamMates.add("Nina");
        teamMates.add("Ibadet");
        teamMates.add("Samet");
        teamMates.add("Cetin");
        teamMates.add("Andrea");
        teamMates.add("Ghirmawit");
        teamMates.add("Cigdem");
        teamMates.add("Abubayda");
        teamMates.add("Edilbek");
        teamMates.add("Iclal");
        teamMates.add("Jeyhun");
        teamMates.add("Mohommad");
        teamMates.add("Zhumgalbek");
        teamMates.add("Shenouda");

        System.out.println("Team size: " + teamMates.size());

        teamMates.add("Azamat - Mentor");

        System.out.println("Team size: " + teamMates.size());

        System.out.println("First person: " + teamMates.get(0) + " and Last person: " + teamMates.get(14));

        //print each value using for each loop

        for (String eachPerson : teamMates) {
            System.out.println(eachPerson);
        }
        System.out.println();
        //Print each value using for loop
        for (int i = 0; i < teamMates.size(); i++) {
            System.out.print(teamMates.get(i) + " ");

        }
        System.out.println();
        System.out.println();
        int count = 16;
        for (int i = teamMates.size() - 1; i >= 0; i--) {
            count--;
            System.out.print(count + ") " + teamMates.get(i) + " ");

        }
        System.out.println();
        //Print 2 people at a time.

        for (int i = 0; i < teamMates.size(); i += 2) {
            if (i == teamMates.size() - 1) {
                System.out.println(teamMates.get(i));
            } else {
                System.out.println(teamMates.get(i) + " | " + teamMates.get(i + 1));


            }
        }

        //Declare String allTeam and add everyone into that string
        //Separated by -(dash)
        //Print out all team

        String allTeam = "";
        for (int i = 0; i < teamMates.size(); i++) {
            if (i == teamMates.size() - 1) {
                allTeam += teamMates.get(i);
                } else {
                allTeam+= teamMates.get(i)+ " - ";

            }
            }
            System.out.println(allTeam);

        }
    }
