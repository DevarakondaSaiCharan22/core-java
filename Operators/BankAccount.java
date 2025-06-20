package Operators;

public class BankAccount {

    public static void main(String[] args) {
        
    int accountHolderId = 3423423;
    String accountHolderName = "Raju";
    int accountHolderNUmber = 935235234;
    double accountHolderBalance = 4500.55;
    double depositAmount = 1000.00;
    double withdrawalAmount = 500.00;
    byte transactions = 50;

    //arthemetic
    double update = depositAmount - withdrawalAmount;

    // relational
     boolean balanceisbelowminimumthreshold = update < 1000;

     boolean ifdepositvaildandaccountisactive = depositAmount > 1000 && accountHolderBalance > 2000;
     transactions++;

     System.out.println("Account Holder Name :"+ accountHolderName);
     System.out.println("updateaccountbalanceafterdepositandwithdraw is " + balanceisbelowminimumthreshold);
     System.out.println("transactions is " + transactions);  
    }


}
