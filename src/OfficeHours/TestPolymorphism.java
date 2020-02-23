package OfficeHours;

public class TestPolymorphism {
    public static void main(String[] args) {

//        ExcelDoc excelDoc = new ExcelDoc("recruiterCalls");
            ExcelDoc excelDoc = new ExcelDoc("recruiterCalls");
            Student student = new Student("Hunter Smith");
            student.sendFile("accounting@gmail.com", excelDoc);
        /*
        Output:
        MicrosoftDocument constructor is executed
        ExcelDoc constructor is executed
        recruiterCalls.xls
        The purpose of Excel Doc is to create tables
        Email: accounting@gmail.com
         */
            WordDoc wordDoc = new WordDoc("MyDocument");
            Student student1 = new Student("Helena White");
            student1.sendFile("H.w@gmail.com", wordDoc);
            System.out.println(wordDoc.getWebsite()); // wordDoc actual type is WordDoc
            //and getWebsite() is overriden there -> www.products.office.com/word
            //where all the instanses of website and getWebsite is not static
            PowerPointDoc powerPointDoc = new PowerPointDoc("MyPresentation");
            student1.sendFile("H.w@gmail.com", powerPointDoc); // powerPoint objective will run
            powerPointDoc.runPresentation(); //Run Presentation: MyPresentation.ppt
            System.out.println(powerPointDoc.getWebsite()); //powerpoint website
            MicrosoftDocument ppDoc = new PowerPointDoc("SecondPresentation");
            //ppDoc.runPresentation(); //runPresentation() is not available to call
            //because MicrosoftDocument is reference type and we don't have it declared in MicrosoftDocument.class
            System.out.println(ppDoc.getWebsite()); //www.office.com we cannot override static
            //method - reference type is MicrosoftDocument
        }
    }
