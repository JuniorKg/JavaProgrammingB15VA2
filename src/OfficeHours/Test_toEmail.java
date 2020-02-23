package OfficeHours;

public class Test_toEmail {
    public static void main(String[] args) {
        Email email1 = new Email();

        email1.setReceiver("juma.@Appple.com");
        email1.setCc("John.Menta@dreamwork.com");
        email1.setSubject("Subject of email");
        email1.setSignature("George Pollock \nSDET in Dreamwork Inc");
        email1.setDate("01-14-2020");
        email1.setBody("Everything we want to say");
        email1.setAttachments(false);
        email1.getEmailInfo();

    }
}
