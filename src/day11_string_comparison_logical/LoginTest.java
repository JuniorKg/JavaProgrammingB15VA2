package day11_string_comparison_logical;

public class LoginTest {
    public static void main(String [] args){
        String userName = "Cybertek";
        String password = "abc123";

        if (userName.equalsIgnoreCase("Cybertek")&& password.equals("abc123")) {
            System.out.println("Login Successful, Welcome!");
        }else if (userName.equalsIgnoreCase("Cybertek") && !password.equals("abc123")){
            System.out.println("Invalid password, try again");
        }else if (!userName.equalsIgnoreCase("Cybertek") && password.equals("abc123")){
              System.out.println("Invalid username, try again");
        }else if (!userName.equalsIgnoreCase("Cybertek") && !password.equals("abc123")){
            System.out.println("Invalid password and login");
        }
    }
    }
