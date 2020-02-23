package day18_for_loop;

public class PrintStars {
    public static void main(String[] args) {

        for (int d = 0; d <= 10; d++) {
            System.out.print("* ");
        }

        String myStars = "";
        int starsCount = 9;
        for (int l = 0; l <= starsCount; l++) {
            myStars = myStars + "* ";
        }
            System.out.println("myStars: "+myStars);

        }
    }
