package day32_custommethods;

public class VoidMethods {
    public static void main(String[] args) {
        // Method name: CountFrom1to10
        // It prints 1 - 10 numbers in same line separated by space
        countFrom1to10();
        System.out.println("--- ENGLISH ALPHABET ---");
        printAtoZ();
        iCanDoIt();
        displayUSFlag();

        }
        public static void countFrom1to10() {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
            public static void printAtoZ() {
                for (char letter = 'A'; letter <= 'Z'; letter++) {
                    System.out.print(letter + " ");
                }
                System.out.println();
            }
             public static void iCanDoIt(){
                    int count = 0;
                 for (int i = 0; i <300 ; i++) {
                     count++;
                     System.out.print(count + ") " + "Java is Fun - I can do it | ");
                 }
                 }
                 public static void displayUSFlag(){
                     String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
                     String p2 = "==============================================";
                     for (int i = 0; i < 4; i++) {
                         System.out.println(p1);
                     }
                     System.out.println("* * * * * * ==================================");
                     for (int i = 0; i < 6; i++) {
                         System.out.println(p2);
                     }


                 }
                }




