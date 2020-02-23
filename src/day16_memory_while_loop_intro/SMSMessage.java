package day16_memory_while_loop_intro;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [John Doe], From Number <2024331234>, Message: {Hey, whats up!}";
        String sender = ""; // [' ]
        String fromNumber = "";
        String txt = "";

        System.out.println(message.indexOf("["));
        System.out.println(message.indexOf("]"));


        System.out.println(message.substring(9,17));

        System.out.println(message.indexOf("<"));
        System.out.println(message.indexOf(">"));

        System.out.println(message.indexOf("{"));
        System.out.println(message.indexOf("}"));

        sender = (message.substring(9,17));
        System.out.println(sender);
        fromNumber = (message.substring(33,43));
        System.out.println(fromNumber);
        txt = message.substring(55, 71);
        System.out.println(txt);











    }
}
