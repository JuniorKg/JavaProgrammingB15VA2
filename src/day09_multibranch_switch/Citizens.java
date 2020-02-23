package day09_multibranch_switch;

public class Citizens {
    public static void main(String[] args) {
        String citizenType = "";
        // declare int age and assign 67
        // if age is 65 or more assign senior to citizenType otherewise assign non-senior to citizenType
        // print "Citizen Type is Senior

        int age = 45;

        if (age >= 65) {
            citizenType = "Senior";
        }else{
            citizenType = "Non-Senior";
        }
        System.out.println("Citizen Type is: " +citizenType);


    }


}
