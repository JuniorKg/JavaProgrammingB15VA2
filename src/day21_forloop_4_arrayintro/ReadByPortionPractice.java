package day21_forloop_4_arrayintro;

public class ReadByPortionPractice {
    public static void main(String[] args) {
        String str = "java, github username, javajava, python, automation java tools, java is most popular";

        System.out.println(str.substring(0, 1));//j
        System.out.println(str.substring(1, 2));//a

        int idx = 0;
        System.out.println(str.substring(idx, idx+1)); // j
        idx++;
        System.out.println(str.substring(idx, idx+1)); //a
        idx = 0;
        System.out.println(str.substring(idx, idx+2)); // ja

        idx++;
        System.out.println(str.substring(idx, idx+2)); //av

        idx = 0;

        System.out.println(str.substring(idx, idx+3)); //jav

        //read 1 at a time using for loop and substring
        for(int i = 0; i < str.length()-3; i++){
            System.out.println(str.substring(i, i+4));
            String temp = str.substring(i, i+4);
            if (temp.equals("java")){
                System.out.println("java is found");
            }



        }


    }
}
