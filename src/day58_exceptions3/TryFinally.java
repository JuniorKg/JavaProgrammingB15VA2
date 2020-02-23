package day58_exceptions3;

public class TryFinally {
    public static void main(String[] args) {
        //Dont try use it in real coding, where they pay you

        try {
            System.out.println("IN TRY BLOCK...");
            System.out.println(9 / 0);
        }finally {
            System.out.println("In Finally block...");
        }

        System.out.println("After try final");
    }
}
