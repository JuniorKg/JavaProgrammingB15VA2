package day47_inheritance_02;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(){
        System.out.println("FULLTIMEEMPLOYEE NO_ARGS CONSTRUCTOR");
    }

    public FullTimeEmployee(String name, String title, double bonus) {
        super(name, title);
        this.bonus = bonus;
    }

    public FullTimeEmployee(double bonus) {
        this.bonus = bonus;
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
