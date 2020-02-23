package day29_review;

public class EmployeesData {
    public static void main(String[] args) {
        String str = "Phil Salt [SDET] psalt@g.co";
        // I want to extract job title
        //find the index of "["
        
        int n1 = str.indexOf("["); //10
        int n2 = str.indexOf("]");//15
        
        //using substring extract job title  - using n1, n2
        //substring (start, end) 2. substring(start) - from start till end
        String job =  str.substring(n1+1, n2);
        System.out.println("job = " + job);

        //rewrite the above code into single statement.

        System.out.println(str.substring(n1+1, n2));
        System.out.println(str.substring(11, 15));
        System.out.println(str.substring(str.indexOf("[")+1, str.indexOf("]")));

        //TASK 2.  extract firstName, lastName and assign to variable
        //indexOf + substring

        String firstName = str.substring(0, str.indexOf(" "));
        System.out.println("firstName = " + firstName);
        String lastName  = str.substring(str.indexOf(" ")+1,str.indexOf(" ["));
        System.out.println("lastName = " + lastName);

        //how to look for a second space
        //indexOf(char) indexOf(start, "char)
        int secondSpace = str.indexOf((" "), str.indexOf(" ")+1);
        System.out.println("secondSpace = " + secondSpace);
        
        String lastName2 = str.substring(str.indexOf(" ")+1, secondSpace);
        System.out.println("lastName2 = " + lastName2);



        //TASK 3. Extract firstName, lastName, using split method of String class
        String [] strArr = str.split(" ");
        System.out.println("strArr length: " + strArr.length);
        String firstName3 = strArr[0];
        String lastName3 = strArr[1];
        System.out.println("firstName3 = " + firstName3);
        System.out.println("lastName3 = " + lastName3);


        String firstName4 = str.split(" ")[0];
        String lastName5 = str.split(" ")[1];
        System.out.println("firstName4 = " + firstName4);
        System.out.println("lastName5 = " + lastName5);

        System.out.println(str.split(" ")[3]); // email






       

    
    }
}
