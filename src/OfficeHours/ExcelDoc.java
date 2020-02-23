package OfficeHours;

public class ExcelDoc extends  MicrosoftDocument {

    public static final String EXTENSION = ".xls";
    private static String website = "www.products.office.com/excel";
    public static String getWebsite() {
        return website;
    }
    public ExcelDoc(String name){
        super();
        this.name = name + EXTENSION;
        System.out.println("ExcelDoc constructor is executed");
    }
    @Override
    public void objective() {
        System.out.println("The purpose of Excel Doc is to create tables");
    }
}
