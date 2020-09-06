package OCA;

public class Question140 {
    static int i;
    int j;

    public static void main(String[] args) {
        Question140 x1 = new Question140();
        Question140 x2 = new Question140();

        x1.i  = 3;
        x1.j  = 4;
        x2.i  = 5;
        x2.j  = 6;
        System.out.println(x1.i  + " " + x1.j + " " + x2.i +" " +  x2. j);


        String s = "Java SE 8 1";
        int len = s.trim().length();
        System.out.println(len);
        System.out.println(s.length());

    }
}
