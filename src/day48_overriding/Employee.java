package day48_overriding;

public class Employee {
    public void calcultatePay(int hours, double rate){
        System.out.println("Employee's total pay is: " + (hours*rate));
    }
        @Override
        public String toString(){
        return "Employee to String()";
        }

    }

