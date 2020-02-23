package OfficeHours;

public abstract class ScrumTeam {
    String employeeName;
    String jobTitle;
    double salary;
    public abstract void demo();
    public abstract void dailyStandUp();

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "employeeName='" + employeeName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
