package bank_accountapp;


public class SavingsAccount extends Bank_Account {
 public double amount;
 public double interestRate = 0.02;

    public SavingsAccount(double initialDeposit) {
        super(initialDeposit);
    }
    public  void withdrawal(double amount){
  
    if(amount > balance){
    System.out.println("You cannot withdraw more than you have in the Account");
    }else{
        CurrentBalance = (balance - amount) - (balance*interestRate);
        System.out.println("You have withdrawed " + amount + " from the Account, now your current Balance is " + CurrentBalance );
    
    }
    }
    public void deposit ( double amount){
    CurrentBalance =(balance + amount) - (balance*interestRate);
    System.out.println("you have depositted " + amount + " into the account" + "Your Current balance is:" + CurrentBalance);
    }
    
}