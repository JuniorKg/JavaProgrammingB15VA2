package MyPractice;
import java.util.*;
public class assign36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String doWeSplit = scan.next();

        int numberOfPeople = scan.nextInt();
        double checkAmount = scan.nextDouble();
        String serviceQuality = scan.next();

        String numOfPeopleString = "&&&&&&&&&&&&&&&&&&&&";
        numOfPeopleString = numOfPeopleString.substring(0, numberOfPeople);

        int loopcount = numberOfPeople;

        while (loopcount >0){
            numOfPeopleString+="&";
            numberOfPeople --;
        }
        double totalTip = 0;
        switch (serviceQuality){
            case "Excellent":
                totalTip = checkAmount * 0.25;
                break;
            case "Great":
                totalTip = checkAmount * 0.20;
                break;
            case "Good":
                totalTip = checkAmount * 0.15;
                break;
            case "Fair":
                totalTip = checkAmount * 0.10;
                break;
            case "Poor":
                totalTip = checkAmount * 0.05;
                break;
        }
        double totalToPay = checkAmount+totalTip;

        double totalToPayPerPeson = 0;
        double totalTipPerPerson = 0;

        if (doWeSplit.equalsIgnoreCase("yes")){
            totalToPayPerPeson = totalToPay/numberOfPeople;
            totalTipPerPerson = totalToPay/numberOfPeople;
        } else if (doWeSplit.equalsIgnoreCase("no")) {
            totalToPayPerPeson = totalToPay;
            totalTipPerPerson = totalTip;



        }
        System.out.println("Number of people entered: " +numberOfPeople);
        System.out.println("Total to pay: " +totalToPay);
        System.out.println("Total tip: " +totalTip);
        System.out.println("Total per person: " +totalToPayPerPeson);
        System.out.println("Tip per person: " + totalTipPerPerson);

    }
}





