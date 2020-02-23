package day47_inheritance_02;

public class EmployeesTest {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee();

        FullTimeEmployee emp = new FullTimeEmployee("Jamil", "SDET", 5);
        System.out.println(emp.getName());
        System.out.println(emp.getTitle());
        System.out.println(emp.getBonus());





    }
}
