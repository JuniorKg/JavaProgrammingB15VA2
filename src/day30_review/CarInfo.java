package day30_review;

public class CarInfo {
    public static void main(String[] args) {
        String car = "MINI-Cooper";
        //MINI-Cooper -> MINI - ******
        //Infinity-QX56 -> Infinity - ********

        /*
         Split or use substring , and get make and model
         Count number of characters in model and use a loop
         build that many stars
         */




        /*
          for (String emp : employees) {
            String[] empArr = emp.split(" ");
            String first = empArr[0];
            String last = empArr[1];
            String job = emp.substring(emp.indexOf("[") + 1, emp.indexOf("]"));
            System.out.println(first + "-" + last + " " + job);
         */
        System.out.println(car.length());

        String [] carArr = car.split("-");
        String make = carArr[0];
        String model = carArr[1];
        /*
        Another option of doing above code
            String make = substring(0,car.indexOf("-");
            String model = car.substring(car.indexOf("-")+1);
         */

        String stars = "";




        for (int i = 0; i < model.length(); i++) {
            stars+= "*";

        }
        
        String carModelMasked = make+"-"+stars;
        System.out.println(carModelMasked);

        
        
        }
    }

