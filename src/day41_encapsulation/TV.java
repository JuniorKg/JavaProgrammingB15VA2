package day41_encapsulation;

public class TV {
    /*
    instance variables / fields:
	- String brand
	- boolean isOn
	- int channel
instance methods/behaviour:
	- setTVInfo()
	- turnOn
	- turnOff
	- setChannel(newChannel)
	- toString
===============================
     */

    String brand;
    String powerState; //"on" "off"
    boolean isOn;
    int channel;

    public void setTVInfo(String pBrand, String pPowerState, int pChannel) {
        System.out.println("INFO: setting TV Information");
        brand = pBrand;
        powerState = pPowerState;
        channel = pChannel;
    }


    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", channel=" + channel +
                '}';
    }

    public void turnOn() {
        if (isOn) {
            System.out.println("WARNING: " + brand + " TV is already on");
        } else {
            System.out.println("INFO: Turning on " + brand + " TV");
            isOn = true;
        }
    }

    public void turnOff() {
        if (isOn) {
            System.out.println("INFO: Turning Off " + brand + " TV");
            isOn = false;
        } else {
            System.out.println("WARNING: " + brand + "TV is already Off");
        }
    }
        /*

            Murodil  8:19 PM
            - setChannel(newChannel)
            - channelUp()
            - channelDown()
         */
        public void setChannel ( int newChannel){
            System.out.println("INFO: Changing channel...");
            channel = newChannel;
        }
        public void channelUp () {
            System.out.println("INFO: next channel...");
            channel++;
        }
        public void channelDown () {
            System.out.println("INFO: previous channel)");
            channel--;

        }
    }
