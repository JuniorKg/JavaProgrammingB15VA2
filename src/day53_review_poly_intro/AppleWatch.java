package day53_review_poly_intro;

public class AppleWatch extends AppleDevice implements Wearable{

    int series ;

    @Override
    public void use() { //AppleDevice
        System.out.println("AppleDevice - using to check time, heartrate");
    }
    @Override
    public void wear() { // It came from Wearable interface
        System.out.println("You can wear it");

    }

    public void countSteps(){
        System.out.println(name + " series " + series + " Counting steps");
    }


}
