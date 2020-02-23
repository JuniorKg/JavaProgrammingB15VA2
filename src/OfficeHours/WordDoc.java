package OfficeHours;

public class WordDoc extends MicrosoftDocument {


    private static String website = "www.products.office.com/word";
    public static String getWebsite() {
        return website;
    }
    public WordDoc (String name){
        this.name = name + EXTENSION; //TODO check if we can use super
        System.out.println("WordDoc constructor is executed");
    }
    public static final String EXTENSION = ".doc";
    @Override
    public void objective() {
        System.out.println("The purpose of Word doc is to create text doc");
    }
}
