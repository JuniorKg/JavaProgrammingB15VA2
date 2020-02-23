package day11_string_comparison_logical;
import java.util.Scanner;
public class SeasonFinder {
    public static void main(String[] args) {
        int month = 11;

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Month # in order to Identify Season");
        month = scan.nextInt();

        if (month >=3 && month <= 5) {
            System.out.println("Spring");
        }else if (month >=6 && month <= 8) {
            System.out.println("Summer");
        }else if (month >=9 && month  <= 11) {
            System.out.println("Fall");
        }else if (month >=12 && month <=2) {
            System.out.println("Winter");
        }else {
            System.out.println("Invalid month #");
        }


           switch (month) {
            case 3: case 4: case 5:
                System.out.println("It is Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("It is Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("It is Fall");
                break;
            case 12: case 1: case 2:
                System.out.println("It is Winter");
                break;
            default:
                System.out.println("Invalid Month #");

        }
    }
}
