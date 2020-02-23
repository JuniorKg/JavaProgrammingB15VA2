package day40_custom_classes;

public class ChekingAccount {
    double balance;
    long accountNumber;
    String accountHolder;
    String type = "Checking";
    public void setInfo(double pBalance, long pAccountNumber, String pAccHolder){
        System.out.println("Setting account info...");
        balance = pBalance;
        accountNumber = pAccountNumber;
        accountHolder = pAccHolder;

    }

    public void getAccountInfo(){
        System.out.println("Checking Account: $" + balance+","+accountNumber+","+accountHolder);
    }
    public void deposit (double amount){
        System.out.println("depositing $" + amount + " to account number: " + accountNumber);
        balance+=amount;
    }
    public void withdraw (double amount) {
        System.out.println("withdrawing $" + amount + " from account number: " + accountNumber);
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("ERROR: InsufficientFundsException. Keep coding Java");
        }
    }
        public void purchase(String item, double price){
        if (price <= balance) {
            System.out.println("Transaction successful for " + item);
            balance -= price;
        }else {
            System.out.println("InsufficientFundsException - Overdraft fee is applied");
            balance -= (price +35);
            System.out.println("Transacrtion is completed for " + item);
        }
            System.out.println("Transaction completed for " + item + " current balance is " + balance);
    }
}
