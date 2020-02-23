package day05_practice_scanner_math;

public class SalaryCalculator {
    public static void main(String[] args){
        int hourlyRate = 55;
        int weeklySalary = hourlyRate*40;
        int monthlySalary = weeklySalary * 52/12;
        int annualSalary = monthlySalary*12;

        System.out.println("My hourly salary is " +hourlyRate);
        System.out.println("My Weekly salary is " +weeklySalary);
        System.out.println("My monthly salary is " +monthlySalary);
        System.out.println("My annual salary is " +annualSalary);

    }
}
