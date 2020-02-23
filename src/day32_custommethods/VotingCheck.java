package day32_custommethods;

public class VotingCheck {
    public static void main(String[] args) {

        printAge(1994);
    }
    public static void printAge(int birthYear){
        int age = 2019 - birthYear;

        if (birthYear<0 || birthYear > 2019) {
            System.out.println("ERROR" + birthYear + " is not a valid BirthYear");
        }else if (birthYear < 2019){
            System.out.println("Your age is: " + age + " You were born in: " + birthYear);

        }
    }
}
