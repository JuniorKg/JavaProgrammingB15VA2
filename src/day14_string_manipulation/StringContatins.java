package day14_string_manipulation;

public class StringContatins {
    public static void main(String[] args) {
        String email = "student@gmail.com";

        System.out.println(email.contains("@"));//true
        System.out.println(email.contains("#"));//false
        System.out.println(email.contains("gmail"));//true
        System.out.println(email.contains("stunt"));//false

        //see if ".com" is in the email, and store result into variable
        //hasDotCom

        boolean hasDotCom = email.contains(".com");
        System.out.println("hasDotCom = " + hasDotCom);

        String list = "milk, eggs, break, water, chocolate, turkey, potatoes, apples";

        //using if statement check if Turkey is in the list
        // if yes -> "Turkey is there!" not -> "We forgot turkey"

        if (list.contains("turkey")){
            System.out.println("Turkey is in there");
        } else {
            System.out.println("We forgot turkey");
        }

        if(list.contains("bananas")) {
            System.out.println("Bananas are in the list");
        }else {
            System.out.println("Lets add Bananas!");
        }


        boolean hasMilk = list.contains("milk");
        System.out.println("hasMilk = " + hasMilk);

        if (hasMilk){
            System.out.println("We got the milk");
        }
       
        // Look for "WATER"
        
        boolean hasWater = list.toUpperCase().contains("Water");
        System.out.println("hasWater = " + hasWater);



        
        
        
    }
}
