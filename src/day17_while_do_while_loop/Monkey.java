package day17_while_do_while_loop;

public class Monkey {
    public static void main(String[] args) {
        int count = 5;

        while (count >=1) {
            if (count ==1) {
                System.out.print(count + " little monkey jumping on the bed");
            }else{
                System.out.print(count + " little monkeys jumping on the bed");
            }
            System.out.println(       "\n One fell down and bumped his head," +
                                       "\n Mama called the doctor and the doctor said," +
                                       "\n No more moneys jumping on the bed");
            count--;
        }
        System.out.println(" Put those monkeys right to bed");
    }
}
