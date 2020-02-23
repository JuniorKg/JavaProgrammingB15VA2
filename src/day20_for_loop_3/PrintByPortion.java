package day20_for_loop_3;

public class PrintByPortion {
    public static void main(String[] args) {
        //String str = "pizza, soup, chicken, kebab, sushi, shrimp, ice cream";
        String str = "my cat, your dog";
        for (int idx = 0; idx < str.length()-2; idx++){
            System.out.println(str.substring(idx, idx+3));
            if (str.substring(idx, idx+3).equals("cat")){
                System.out.println("cat found");

            }

        }



    }
}
