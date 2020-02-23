package day21_forloop_4_arrayintro;

public class LookForAnError {
    public static void main(String[] args) {
        String log = "<error:atable style=display: none;<tbody><error:btr " +
                "id=edit_rubric><td coerror:qlspan=4><form id=error:jedit_rubric_form " +
                "class=edit-rubric-formerror:p no-margin-bottom>error:a";

        //Count number of Errors
        //Optionally also print type of error

        int errorCount = 0;

        for (int i = 0; i < log.length()-4; i++) {
           // System.out.println(log.substring(i, i + 5));
            String temp = log.substring(i, i + 5);
            if (temp.equals("error")) {
                System.out.println("ERROR FOUND! At index - " + i);
                errorCount++;
              //  System.out.println("ERROR TYPE: " + log.charAt(i+6)); //Finding TypeError
            }
        }
            if (errorCount > 0) {
                System.out.println("FAIL: " + errorCount + " ERRORS DETECTED IN THE LOG");
            }else {
                System.out.println("No ERRORS DETECTED IN THE LOG");


            }


        }


    }


