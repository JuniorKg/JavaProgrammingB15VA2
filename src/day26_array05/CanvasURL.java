package day26_array05;

public class CanvasURL {
    public static void main(String[] args) {
        String url = "www.learn.cybertekschool.com/courses/288/modules";
        //declare String array with 4 items and assign values
        String [] urlArr = new String[4]; //0,1,2,3
        urlArr[0] = "www.learn.cybertekschool.com";
        urlArr[1] = "courses";
        urlArr[2] = "288";
        urlArr[3] = "modules";

       // url.split("/");
        String [] splitUrlArr = url.split("/");

        //for loop: repeat certain action certain times

        for (int i = 0; i < splitUrlArr.length; i++) {
            System.out.println(splitUrlArr[i]);

        }

        //for each loop: - arrays and other collections.To iterate one by one.

        for (String each : splitUrlArr ){
            System.out.println(each);

        }
        
        //declare 4 variables, baseUrl, resource, id. target.
        //and assign values from the arrays' indexes 
        
        String baseUrl = splitUrlArr[0];
        String resource = splitUrlArr[1];
        String id = splitUrlArr[2];
        String target = splitUrlArr[3];

        System.out.println("baseUrl = " + baseUrl);
        System.out.println("resource = " + resource);
        System.out.println("id = " + id);
        System.out.println("target = " + target);

        /*
        Check the id and print course name, using conditional statement
        if 288 > JavaProgramming
           287 > InterviewPreparation
           286 > API Testing
           289 > QA Testing
           290 > Review
           -> Unknown Course
         */

        switch (id){
            case "288":
                System.out.println("Java Programming");
                break;
            case "287":
                System.out.println("Interview Preparation");
                break;
            case "286":
                System.out.println("API Testing");
                break;
            case "289":
                System.out.println("QA Testing");
                break;
            case "290":
                System.out.println("Review Sessions");
                break;
            default:
                System.out.println("Unknown Course");
        }
        System.out.println("CODE EXECUTION COMPLETED");
        
        

    }
}
