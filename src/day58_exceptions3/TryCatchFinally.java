package day58_exceptions3;
import java.net.*;
public class TryCatchFinally {
    public static void main(String[] args) {

            try {
                System.out.println("IN TRY BLOCK...");
                URL etsyUrl = new URL("https://www.etsy.com");

                System.out.println("END OF TRY BLOCK...");
            } catch (MalformedURLException e) {
                System.out.println("MalformedURLException is caught and handled...");
                //e.printStackTrace();
                System.out.println("Reason: " + e.getMessage());
            }finally{
                System.out.println("Finally Block - runs always");
            }
            try{
                System.out.println("In 2nd try block...");
                int num = Integer.parseInt("123");
                System.out.println("End of second try block...");
            } catch(NumberFormatException e){
                System.out.println("NumberFormatException was caught and handled...");
                System.out.println("message: " + e.getMessage());
                System.out.println("reason: " + e.getCause());
            } finally {
                System.out.println("2nd Finally block. Runs All the time..");
            }

        System.out.println("AFTER 2ND TRY CATCH FINALLY...");



        }
    }
