package day40_custom_classes;

public class BankAccountTest {
    public static void main(String[] args) {
        //create an account
        ChekingAccount clientOne = new ChekingAccount();
        //set data

        clientOne.accountNumber = 3345674367L;
        clientOne.accountHolder = "Wooden Spoon";
        clientOne.balance = 500.0;

        System.out.println("clientOne.accountHolder = " + clientOne.accountHolder);
        System.out.println("clientOne.accountNumber = " + clientOne.accountNumber);
        System.out.println("clientOne.balance = " + clientOne.balance);

        clientOne.getAccountInfo();

        ChekingAccount clientTwo = new ChekingAccount();

        clientTwo.setInfo(10000, 54353534435L, "Zhumgalbek A");
        clientTwo.getAccountInfo();

        //test deposit method
        clientOne.deposit(400);
        clientOne.getAccountInfo();

        clientTwo.deposit(1000);
        clientTwo.getAccountInfo();

        ChekingAccount clientThree = new ChekingAccount();

        clientThree.setInfo(100.0, 33131221412L, "Irma K");
        clientThree.getAccountInfo();
        clientThree.purchase("Book", 110.0);





    }
}
