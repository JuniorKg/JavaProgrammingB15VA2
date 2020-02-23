package OfficeHours;

public abstract class MicrosoftDocument {

    private static String website = "www.office.com";
    public static String getWebsite() {
        return website;
    }
    public MicrosoftDocument(){
        System.out.println("MicrosoftDocument constructor is executed");
    }
    String name;
    public abstract void objective();
}


