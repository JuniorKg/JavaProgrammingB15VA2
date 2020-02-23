package day31_multidarrays_methods;

public class ValidDate {
    public static void main(String[] args) {


        //  month/day/year
        // valid month  1-12
        // valid day 1 - 30/31 -> 1 - 28/29
        // valid year -> any positive ->
        int[] date = {02, 29, 2019};

        boolean isValidDate;

        if (date[1] >= 1 || date[1] <= 31) {
            if (date[0] == 1 || date[0] == 3 || date[0] == 5 || date[0] == 7 || date[0] == 8 ||
                    date[0] == 10 || date[0] == 12) {
                System.out.println("The month and date are: " + (isValidDate = true));
                if (date[1] >= 1 || date[1] <= 30) {
                }
                if (date[0] == 4 || date[0] == 8 || date[0] == 9 || date[0] == 11 && date[1] >= 1 || date[1] <= 30) {
                    System.out.println("The month and date are: " + (isValidDate = true));
                } else if (date[0] == 2 && date[1] >= 1 && date[1] <= 28) {
                    System.out.println("The month and date are: " + (isValidDate = true));
                } else if (date[0] == 2 && date[1] == 29) {
                    System.out.println("Leap year : " + (isValidDate = true));
                } else {
                    System.out.println("Invalid date");
                }

            }

            // with Switch

//        switch (date[0]){
//            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//                if (date[1] <= 31){
//                    System.out.println("Valid date");
//                }
//                break;
//            case 4: case 6: case 9: case 11:
//                if ( date[1] == 31) {
//                    System.out.println("Invalid date");
//                }else {
//                    System.out.println("Valid date");
//                }
//                break;
//            case 2:
//                if (date[0] > 29) {
//                    System.out.println("Invalid date");
//                }else {
//                    System.out.println("Valid date");
//                }
        }
    }
}

