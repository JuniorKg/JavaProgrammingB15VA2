package day58_exceptions3;
import java.util.*;

public class MultiMatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value:");
        String str = scan.next();


        try {
            int num = Integer.parseInt(str.substring(0, 3));
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException  caught");
            System.out.println("message: " + e.getMessage());
            System.exit(1);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException caught");
            System.out.println("message: " + e.getMessage());
        }catch(NullPointerException e) {
            System.out.println("NullPointerException is caught");
            System.out.println("message: " + e.getMessage());
        }catch(Throwable t){
            System.out.println("Throwable is caught!");
        } finally{
            System.out.println("Finally Block: always runs " + str);
            scan.close();
        }

        System.out.println("AFTER MULTI CATCH");
    }

}
