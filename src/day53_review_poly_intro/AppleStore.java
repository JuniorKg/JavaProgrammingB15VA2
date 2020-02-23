package day53_review_poly_intro;

public class AppleStore {
    public static void main(String[] args) {
       // AppleDevice appDev = new AppleDevice(); Cannot instantiate
        AppleWatch iWatch = new AppleWatch();
        iWatch.name = "Apple Watch";
        iWatch.series = 5;
        iWatch.use();
        iWatch.wear();
        iWatch.countSteps();

        System.out.println("==============================");
        Iphone iPhone = new Iphone();
        iPhone.name = "Apple Iphone Pro max";
        iPhone.model = "11";
        iPhone.use();
        iPhone.wear();
        iPhone.code();
        iPhone.navigation();



        System.out.println("==============================");
        MacPro macPro = new MacPro();
        macPro.name = "Apple MacPro";
        macPro.model = "Grater";
        macPro.use();
        macPro.code();








            }
        }









