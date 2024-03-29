package day59_exceptions_collection1;

public class ThrowsKeyword {
    public static void main(String[] args) {//throws InterruptedException {
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(int seconds) throws InterruptedException{
        System.out.println("sleeping for " + seconds + " seconds");
        Thread.sleep(1000);
    }

    public static void myMethod() throws NullPointerException{
        System.out.println("myMethod, I might throw NullPointer Exception");
    }
}
