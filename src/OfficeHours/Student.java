package OfficeHours;

public class Student {

    String name;
    public Student (String name){
        this.name = name;
    }
    public void sendFile(String email, MicrosoftDocument md){
        //MicrosoftDocument md = new ExcelDoc("recruiterCalls");
        System.out.println(md.name);
        md.objective();
        System.out.println("Email: " + email);
    }
}
