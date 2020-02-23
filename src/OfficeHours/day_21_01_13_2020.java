package OfficeHours;

public class day_21_01_13_2020 {


        /*
        OOP - is developing the code using objects

        inheritance
        encapsulation
        abstraction
        polimorphism

        Object is an instance of the class
        Creation of object called instantiation
        java class - template / blueprint

        Example :
        Building plan - Class
        Builders can build unlimited amount of houses with that plan
        house - object

        -----------------------------------

        Class is defined what an object properties and behaviors are

        properties/attributes/fields - data fields with some values
        behaviors/actions - defined by methods

         */

        /*
        TASK:
        create the class callled MailingPackage
        define instant variables:
        String:
            nameFrom
            nameTo
            addressFrom
            addressTo
            shipping Status
            int  weight
            double shippingPrice
            boolean isInsured
            boolean hazardousContents


            behavior:

            shipThePackage() - > shippingStatus - LabelGenerated
         */


    public static void main(String[] args) {
        MailingPackage package1 = new MailingPackage();

        package1.nameFrom = "Josh Miller";
        package1.nameTo = "Don Johnson";
        package1.addressTo = "Tysons VA";
        package1.addressFrom = "New York NY";
        package1.hazardousContents = false;
        package1.weight = 6;


        package1.packageInfo();
        package1.shipThePackage(25, true);
        package1.changeTheAddress("Austin TX");
        package1.delivery();
        package1.packageInfo();

        package1.changeTheAddress("Miami FL");
        package1.packageInfo();









    }
}
