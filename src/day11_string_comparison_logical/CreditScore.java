package day11_string_comparison_logical;

public class CreditScore {
    public static void main(String[] args) {
        int score = 777;
        //Excellent 750-850

        if (score>=750 && score <= 850) {
            System.out.println(score + " is Excellent");
        }else if (score >= 700 && score  <= 749) {
            System.out.println(score + " is Good");
        }else if (score >= 650 && score <= 699) {
            System.out.println(score + " is Fair");
        }else if (score >= 550 && score <= 649){
            System.out.println(score + " is Poor");
        }else if (score >= 550 && score <= 0) {
            System.out.println(score + " is bad");
        }else {
            System.out.println("No credit for you");

        }
    }
}
