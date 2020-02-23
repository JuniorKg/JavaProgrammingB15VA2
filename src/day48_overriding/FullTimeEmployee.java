package day48_overriding;

public class FullTimeEmployee extends Employee{
    public void calculatePay(int hours, double rate){
        System.out.println("FullTime employee's total pay is: " + (hours*rate)*1.25);

    }

    @Override
    public String toString(){
        return "FullTime to String()";
    }
}
