package day13_string_manipulation;

public class StringLength {
    public static void main(String[] args) {
        String school = "Cybertek School";
        //print number of characters

        System.out.println(school.length());

        //store school length into an int variable  - count
        int count = school.length();
        System.out.println(school + " is " + count);

        String firstName = "Zhumgalbek";
        String lastName = "Amangulov";

        int fullNameCount = firstName.length() + lastName.length();
        System.out.println("fullNameCount = " + fullNameCount);

        String password = "cybertek123";
        // check if the password is more than 8 characters;
        // if yes , "Password length matches requirement not " Password is too short needs to be minimum 8 character"

        if (password.length() >= 8) {
            System.out.println("Password length matches requirement");
        }else{
            System.out.println("Password is too short needs to be minimum 8 character");

        }


        //assign to int variable pLenght and check if it is 8-16 characters

        int pLenght = password.length();

        if (pLenght>=8 && pLenght<=16){
            System.out.println("Password length matches requirement");
        }else{
            System.out.println("Password is too short needs to be minimum 8 character");
        }

     



    }
}
