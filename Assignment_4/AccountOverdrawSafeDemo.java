package Assignment_4;

public class AccountOverdrawSafeDemo implements Runnable {
    public Account account = new Account();
  
      public void run() 
      {
  
      for(int i=0; i<5; i++)
      {
              makeWithdraw(50);
              if(account.balance<0)
              {
               System.out.println("Account is overdrawn !!");
              }
      }
      }
  
      public void makeWithdraw(int amount) 
      {
          if(account.balance >= amount){
              System.out.println(Thread.currentThread().getName()+" going for withdrawal of: "+ amount);
              System.out.println("Current balance : "+ account.balance);
          try {
                 Thread.sleep(1000);
              } 
          catch (Exception e) {
              System.out.println("Error during Transaction");
          }
          account.Withdraw(amount);
          System.out.println("your withdrawal is completed on : "+ Thread.currentThread().getName());
          System.out.println("your Remaining Balance : "+ account.balance);
      
      }
      else{
      System.out.println("your amount is not enough for withdrawal in account "+Thread.currentThread().getName());
      System.out.println("your remaining balance is : "+ account.balance);
      }
  
  }
  }