package day57_exceptions2;

public class CheckedExceptionDemo {
    public static void main(String[] args)throws Exception {
        System.out.println("Checked Exception is next Line");
//        try {
            Thread.sleep(1000);
 //       }catch(Exception e){
//            System.out.println("Exception was caught!");
//        }
        System.out.println("After Thread.sleep");
    }
}
