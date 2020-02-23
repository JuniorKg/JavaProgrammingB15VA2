package day33_methods;

public class VoidMethodsPractice {
    public static void main(String[] args) {
        printDay(1);

        buildEmail("Juma Amangulov", "Apple");

        checkEligible(650);
        int [] scores = {700,570, 800};
        checkEligible(scores[0]);
        checkEligible(scores[1]);
        checkEligible(scores[2]);
        //TRY With a LOOP

        for (int each : scores){
            checkEligible(each);
        }
    }

    public static void printDay(int day){
        if (day == 1){
            System.out.println("Monday");
        } else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3){
            System.out.println("Wednesday");
        } else if (day == 4){
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        } else if (day == 6){
            System.out.println("Saturday");
        } else if (day == 7){
            System.out.println("Sunday");
        } else {
            System.out.println("No such day");
        }
    }

        public static void buildEmail(String name, String company){

            name = (name.replace(" ", ""));
            company = (company.replace(" ", ""));

            String email = (name.toLowerCase() + "@" + company.toLowerCase()  +".com");

            System.out.println(email);

         }

         public static void checkEligible(int creditScore){

            if (creditScore >= 640) {
                System.out.println("You are eligible for this transaction");
            }else {
                System.out.println("Sorry, you are not eligible for this loan. Go study Java");
            }


         }
        }

