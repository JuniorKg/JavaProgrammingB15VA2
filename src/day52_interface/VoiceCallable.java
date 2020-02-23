package day52_interface;

public interface VoiceCallable {
    //abstract method
    //public static final variables ONLY
    public static final boolean CAN_CALL = true;


    public abstract void call(String contact);

    /**
     * Only abstract methods before Java 8. Pure abstract
     * AFTER JAVA 8 - static and default method are added
     */
    //static method:
    public static  void decline(){
        System.out.println("Nadir declined a Voice call...");
    }

    //default:
    public default void accept(){
        System.out.println("Nadir finally accepted the voice call...");
    }





}
