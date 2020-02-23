package day33_methods;

public class MethodsWithReturn {
    public static void main(String[] args) {
        System.out.println(getName());
        String myName = getName();
        System.out.println("myName = " + myName);

        int wallet = giveMe5Dollars();
        System.out.println("How much in wallet? - $" +wallet);
    }


    public static String getName() {
        return "Juma";
    }




    public static int giveMe5Dollars(){
        int dollar = 5;
        return  dollar;
        // call giveMe5Dollars method
    }
}
