package bankaccout;

import java.util.Scanner;

class BankAccount1 {
      private double balance;
      public BankAccount1(double Balance)
      {
          this.balance=Balance;
      }
      public double getBalance()
      {
          return balance;
      }
      public void deposit(double amount)
      {
          if(amount>0)
          {
              balance=balance+amount;
              System.out.println("Deposit Successfully");
          }
          else
          {
              System.out.println("Invalid amount for deposit");
          }
      }
      public void withdraw(double amount)
      {
          if(amount>0 & amount<=balance)
          {
              balance=balance-amount;
          }
          else
          {
              System.out.println("Insufficient funds or invalid amount for withdrawal");
          }
      }
    
}
class ATM
{
    private BankAccount1 account;
    private Scanner SC;
    
    public ATM(BankAccount1 account)
    {
        this.account=account;
        this.SC=new Scanner(System.in);
    }
    public void showMenu()
    {
        System.out.println("1.CheckBalance");
        System.out.println("2.Deposit");
        System.out.println("3.withdraw");
        System.out.println("4.Exit");
    }
    public void run()
    {
        int choice;
        do
        {
            showMenu();
            System.out.println("Enter Your Choice");
            choice=SC.nextInt();
            switch(choice)
            {
                case 1:
                    CheckBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        while(choice!=4);
        
            
    }
    private void CheckBalance()
    {
        System.out.println("your current balance is:"+account.getBalance());
    }
    private void deposit()
    {
        System.out.println("enter amount to deposit");
        double amount=SC.nextDouble();
        account.deposit(amount);
    }
    private void withdraw()
    {
        System.out.println("enter amount to withdraw");
        double amount=SC.nextDouble();
        account.withdraw(amount);
    }
}
public class TASK3ATMINTERFACE {

    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Welcome to ATM");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your four digit PIN");
        int pin=sc.nextInt();
        
        BankAccount1 userAccount=new BankAccount1(1000);
        ATM atm=new ATM (userAccount);
        atm.run();
    }   
}

