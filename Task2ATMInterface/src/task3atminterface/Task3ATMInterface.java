
package task3atminterface;

import java.util.*;
public class Task3ATMInterface {

    
    public static void main(String[] args) {
      int balance=0,withdraw,deposit;
      Scanner sc=new Scanner(System.in);
      while(true)
      {
          System.out.println("ATM Machine");
          System.out.println("Choose 1 for withdraw");
          System.out.println("Choose 2 for deposit");
          System.out.println("Choose 3 for CheckBalance");
          System.out.println("Choose 4 for Exit");
          System.out.println("Choose the Operation");
          
          int choice=sc.nextInt();
          switch(choice)
          {
              case 1:
                  System.out.println("Enter money to be withdraw");
                  withdraw=sc.nextInt();
                  
                  if(balance>=withdraw)
                  {
                      balance=balance-withdraw;
                      System.out.println("Plase collect your money");
                      
                  }
                  else 
                  {
                      System.out.println("Insufficient Balance");
                  }
                  System.out.println(" ");
                  break;
                  
              case 2:
                  System.out.println("Enter money to be deposit");
                  deposit=sc.nextInt(); 
                  balance=balance+deposit;
                  System.out.println("Your money has been successfully");
                  System.out.println(" ");
                  break;
                  
              case 3:
                  System.out.println("Balance:"+balance);
                  System.out.println(" ");
                  break;
                  
              case 4:
                  System.exit(0);
                  
                  
          }
                 
      }
    }
    
}
