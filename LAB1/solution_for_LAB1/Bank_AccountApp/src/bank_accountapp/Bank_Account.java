package bank_accountapp;
import java.util.Scanner;

public class Bank_Account {

   
 public double amount;
    public double balance;
    public double deposit;
    public double withdraw;
   public double CurrentBalance = balance + amount;
   
   
    public Bank_Account(double initialDeposit){
        balance = 500;
        deposit =0.00;
        withdraw = 0.00;
    }
    // the methods of withdrawing and depositing
    public void setBalance(double balance){
        balance = balance;
    }
     public double getBalance(){
        return balance;
    }
    public void setAccountName(String AccountName){
        AccountName = AccountName;
    }
    public void setDeposit(double amount){
        balance = balance;
    }
       public double getDeposit(){
        return deposit;
    }
    public void setWithdraw(double amount){
        if(amount > balance){
            System.out.println("Error");
        }
        else
        withdraw  = balance;
    }
    public double getWithdraw(){
        return withdraw;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Entering the Account number
        System.out.println("Enter your Bank Acoount");
        double BankAcc = input.nextDouble();
        int amount = 0;
        //choosing from which account you want to do the transition
        System.out.println("Which Account would you like to do the transaction?"
                 + "Enter 1 for Savings, 2 for Checking or 3 for investment");
         int account = input.nextInt();
         if(account == 1){
          SavingsAccount saccount = new  SavingsAccount(account);
         }
          else if(account == 2){
           
          CheckingAccount caccount = new CheckingAccount(account);
          }
          else if(account == 3){
              InvestmentAccount inaccount = new InvestmentAccount(account);
          }

            System.out.println("Would like to deporsit or withdraw? Enter 1 for Deposit or 2 for withdrwall");
            int choice = input.nextInt();
       
         //Choosing the transition yu want to make, whether to withdraw or deposit.
        if(choice == 1){
            System.out.println("Depositing");
            amount = input.nextInt();
            SavingsAccount depo = new SavingsAccount(amount);
            depo.deposit(amount);
            
            
        } else if(choice == 2 ) {
            System.out.println("Withdrawing");
            amount = input.nextInt();
             SavingsAccount withdraw = new  SavingsAccount(amount);
        withdraw.withdrawal(amount);
           
            
        
        }
    }
}
     