package day08_if_statements;

public class CheckPincode {
    public static void main(String[] args){
        int secretPincode = 2345;
        int inputPincode = 2345;
        if (inputPincode == secretPincode){
            System.out.println("Welcome to Your Account");
            System.out.println("You can withdraw, deposit, view balance");}
        else{
            System.out.println("Invalid pincode!");
            System.out.println("Access denied"); }

        System.out.println("Thank you for your business! Bye");

    }
}
