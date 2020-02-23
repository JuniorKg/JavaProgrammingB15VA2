package day12_ternary_string_manipulation;

public class ThreeNums {
    public static void main(String[] args) {
        int num1=5, num2=10, num3=2;

        if (num1>=num2 && num1>=num3){
            System.out.println(num1+ " is the largest");
        }else if (num2>=num1 && num2>=num1){
            System.out.println(num2+ " is the largest");
        }else if (num3>=num1 && num3>=num2){
            System.out.println(num3+ " is the largest");
        }else {
            System.out.println("Error");
        }
    }
}
  // CLS