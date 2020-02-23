package day35_wrapper_classes;

public class ApartmentLease {
    public static void main(String[] args) {
        applyForApartment(650);
    }


    /*
    Create a class ApartmentLease
Method: qualify
Params: none
return: void
"Congratulations, your application for apartment is approved!"
Method: notQualify
Params: none
return: void
"Unfortunately, your application for apartment is denied! Bye More Code Java"
Method: applyForApartment
param/args: int creditScore
return: void
creditscore -> 650 - 850
    qualify
creditscore < 650
    notQualify

     */

public static void qualify(){
    System.out.println("Congratulations, your application for apartment is approved!");
}
public static void notqualify(){
    System.out.println("Unfortunately, your application for apartment is denied! Bye More Code Java");
}
public static void applyForApartment(int creditScore){
    if (creditScore >= 650 && creditScore<= 850 ){
        qualify();
    } else {
        notqualify();
    }
}
}