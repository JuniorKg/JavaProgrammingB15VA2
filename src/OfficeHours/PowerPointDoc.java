package OfficeHours;

public class PowerPointDoc extends MicrosoftDocument {

    private static String website = "www.products.office.com/powerpoint";
    public static String getWebsite() {
        return website;
    }
    public static final String EXTENSION = ".ppt";
    public PowerPointDoc(String name){
        this.name = name + EXTENSION;
        System.out.println("PowerPoint constructor is executed");
    }
    @Override
    public void objective() {
        System.out.println("The purpose of power point is to create presentation");
    }
    public void runPresentation(){
        System.out.println("running presentation: " + this.name);
    }
}