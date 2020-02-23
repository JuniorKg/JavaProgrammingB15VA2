package day48_overriding;

public class EmployeesPayTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.calcultatePay(40, 65);


        Contractor contractor = new Contractor();
        contractor.calculatePay(40, 65);

        FullTimeEmployee fullTime = new FullTimeEmployee();
        fullTime.calculatePay(40, 65);

        System.out.println(employee.toString());
        System.out.println(fullTime.toString());
        System.out.println(contractor .toString());




    }
}