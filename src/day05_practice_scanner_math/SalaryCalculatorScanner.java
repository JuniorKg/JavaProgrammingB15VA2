package day05_practice_scanner_math;
import java.util.Scanner;
public class SalaryCalculatorScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your Hourly Rate?");
        double hourlyRate = input.nextDouble();
        double weeklySalary = hourlyRate*40;
        double monthlySalary = weeklySalary*52;
        double annualSalary = monthlySalary*12;

        System.out.println("Your Weekly Salary: " +hourlyRate*40);
        System.out.println("Your Monthly Salary: " +weeklySalary);
        System.out.println("Your annual salary: " + annualSalary);


    }

}
