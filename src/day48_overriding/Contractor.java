package day48_overriding;

public class Contractor extends Employee {

        public void calculatePay(int hours, double rate){
            System.out.println("Contractor employee's total pay is: " + (hours*rate+200));
    }

    @Override
    public String toString(){
        return "Contractor to String() | " + super.toString();
    }

}
