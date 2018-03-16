package bank_accountapp;

public class CheckingAccount extends Bank_Account {
    
     public double balance;

    public CheckingAccount(double initialDeposit) {
        super(initialDeposit);
    }
    public  void withdrawal(double amount){
  
    if(amount > balance){
    System.out.println("You cannot withdraw more than you have in the Account");
    }else{
        CurrentBalance = balance - amount;
        System.out.println("You have withdrawed " + amount + " from the Account, now your current Balance is " + CurrentBalance );
    
    }
    }
    public void deposit ( double amount){
    CurrentBalance = balance + amount;
    System.out.println("you have depositted " + amount + " into the account");
    }

}