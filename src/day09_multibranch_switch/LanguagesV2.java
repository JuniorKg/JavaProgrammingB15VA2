package day09_multibranch_switch;

public class LanguagesV2 {
    public static void main(String[] args) {
        String language = "";
        String greeting = "";
        int option = 5;

        if (option == 1) {
            language = "English";
            greeting = "Hello!";
        } else if (option == 2){
            language = "Espaniol";
            greeting = "Hola!";
        } else if (option == 3) {
            language = "Francais";
            greeting = "Bonjour!";
        } else if (option == 4) {
            language = "Arabia";
            greeting =  "Salam!";
        } else if (option == 5) {
            language = "Русский";
            greeting = "Привет!";
        } else if (option == 6) {
            language = "Turkce";
            greeting = "Merhaba!";
        }else {
            language = "L'Italiano";
            greeting = "Ciao";
        }
        System.out.println(language+ " : " +greeting);




    }
}
