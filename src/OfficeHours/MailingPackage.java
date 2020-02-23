package OfficeHours;

public class MailingPackage {
        String nameFrom;
        String nameTo;
        String addressFrom;
        String addressTo;
        String shippingStatus;
        int  weight;
        double shippingPrice;
        boolean isInsured;
        boolean hazardousContents;

        public void shipThePackage(double price, boolean insured){
            shippingStatus = "LabelGenerated";
            shippingPrice = price;
            isInsured = insured;

        }

        public void packageInfo(){
            System.out.println("addressFrom: " + addressFrom + "\naddressTo: " +
                    addressTo + "\nnameFrom: " + nameFrom + "\nnameTo: " + nameTo +
                    "\nweight: " + weight + "\nshippingPrice: " + shippingPrice +
                    "\nshippingStatus: " + shippingStatus + "\nisInsured: " +isInsured+
                    "\nhazardousContents: " + hazardousContents);
        }

        public void loadToTheTruck(){
            shippingStatus = "InTransit";
        }

        public void delivery(){
            shippingStatus = "Delivered";

        }

        public void changeTheAddress(String address) {
            if (!shippingStatus.equalsIgnoreCase(("delivered"))) {
                addressTo = address;
            } else {
                System.out.println("Shipping address can not be changed. The package is already delivered");
            }
        }

    }

