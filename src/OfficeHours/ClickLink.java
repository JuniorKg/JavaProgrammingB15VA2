package OfficeHours;
import java.util.Scanner;
public class ClickLink {
    public static void main(String[] args) {
        /*
                print/do different statements based
                on the button name that is passed
                String button - > Scanner
                use switch
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What button you want to click: ");
        String button = scanner.next();
        /*
            equals
            equalsIgnore
            upper
            lower
            contains
            charAt
            length
         */
        /*
            Username contain @ and .com
            password:
                    start with lower letter
                    min 8 chars
                    contain $
                    end with upper letter
                    cybertek$B
                    charAt() - take index - give back the char
         */
        switch (button) {
            case "Login":
                System.out.println("Please enter username");
                String username = scanner.next();
                System.out.println("Please enter password");
                String password = scanner.next();

                //FIRST IF: below line we are checking for username to contain @ and .com
                if (username.contains("@") && username.contains(".com")) {
                    //SECOND IF: below line will execute ONLY if FIRST IF is true; here we are checking if password starts with lower letter
                    if (password.charAt(0) >= 'a' && password.charAt(0) <= 'z') {
                        //THIRD IF: below line will execute ONLY if SECOND IF is true; here we are checking if password is min 8 chars
                        if (password.length() >= 8) {
                            //FOURTH IF: below line will execute ONLY if THIRD IF is true; here we are checking if password contains $
                            if (password.contains("$")) {
                                //FIFTH IF: below line will execute ONLY if FOURTH IF is true; here we are checking if password ends with upper letter
                                if (password.charAt(password.length() - 1) >= 'A' &&
                                        password.charAt(password.length() - 1) <= 'Z') {
                                    //ONLY if all above if conditions are true - this message will be printed
                                    System.out.println("We clicking on login button");
                                    //below 'else' belongs to FIFTH IF and will run ONLY if FIFTH IF is false
                                } else {
                                    System.out.println("last letter of your password is not Uppercase alphabetical char");
                                }
                                //below 'else' belongs to FOURTH IF and will run ONLY if FOURTH IF is false
                            } else {
                                System.out.println("password does not contain $");
                            }
                            //below 'else' belongs to THIRD IF and will run ONLY if THIRD IF is false
                        } else {
                            System.out.println("Your password is too short");
                        }
                        //below 'else' belongs to SECOND IF and will run ONLY if SECOND IF is false
                    } else {
                        System.out.println("1st letter of your password is not lowercase alphabetical char");
                    }
                    //below 'else' belongs to FIRST IF and will run ONLY if FIRST IF is false
                } else {
                    System.out.println("Username is not valid");
                }
                //==========================================================================================
                //We could also do similar thing if we just use && for all conditions in one if statement
                if(username.contains("@") && username.contains(".com") &&
                        password.charAt(0) >= 'a' && password.charAt(0) <= 'z' &&
                        password.length() >= 8 &&
                        password.contains("$") &&
                        password.charAt(password.length() - 1) >= 'A' && password.charAt(password.length() - 1) <= 'Z'){

                    System.out.println("We clicking on login button");

                }else{
                    System.out.println("Username or password does not meet desired requirements");
                }
                //==============================================================================================
                break;
            case "Log out":
                System.out.println("We clicked logout");
                break;
            case "Home":
            case "Go to Home page":
            case "Return to Home":
                System.out.println("Navigated to home page");
                break;
            default:
                System.out.println("Invalid button");
        }

    }
}
