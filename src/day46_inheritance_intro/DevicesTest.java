package day46_inheritance_intro;

public class DevicesTest {
    public static void main(String[] args) {
        Device device = new Device();

        device.brand = "LG";
        device.price = 900;
        device.country = "South Korea";
        device.use();


        TV tv = new TV();
        tv.brand = "Sony";
        tv.price = 800;
        tv.country = "Japan";
        tv.screenSize = 66;
        tv.isSmart = true;
        tv.use();
        tv.watch();


        Phone phone = new Phone();
            phone.brand = "Iphone PRO max";
            phone.country = "USA";
            phone.price = 1250;
            phone.carrier = "Verizon";

            phone.call();
            phone.text();
            phone.use();


            SmartPhone smartPhone = new SmartPhone();
            smartPhone.brand = "Samsung Galaxy Note 10";
            smartPhone.price = 899.0;
            smartPhone.country = "South Korea";
            smartPhone.carrier = "Verizon";
            smartPhone.memorySize = 128;

            smartPhone.use();
            smartPhone.text();
            smartPhone.call();
            smartPhone.useApp("Slack");

    }


    }

