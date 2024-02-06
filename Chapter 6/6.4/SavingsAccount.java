/**
The SavingsAccount class stores data about a savings account
for the SavingsAccount Class programming challenge.
*/

public class SavingsAccount
{
   private double balance = 0;
   private double interest = 0;
   private double lastInterest = 0;
   private double totalInterest = 0;

   /**
    The constructor initializes an object with a
    balance and an annual interest rate.
    @param bal The account balance.
    @param intRate The annual interest rate.
    */
   public void account(double bal, double intRate)
   {
     balance = bal;
     interest = (intRate/100)/12;
     System.out.println(interest);
   }
   /**
    The withdraw method withdraws an amount from
    the account.
    @param amount The amount to withdraw.
    */
   public void withdraw(double amount)
   {
     balance = balance - amount;
   }
   /**
    The deposit method deposits an amount into
    the account.
    @param amount The amount to deposit.
    */
   public void deposit(double amount)
   {
     balance = balance + amount;
   }
   /**
    The addInterest method calculates the monthly
    interest and adds it to the account balance.
    */
   public void addInterest()
   {
       lastInterest = interest * balance;
       System.out.println(lastInterest);
       balance = balance + lastInterest;
       System.out.println(balance);
       totalInterest = totalInterest + lastInterest;
       System.out.println(totalInterest);
   }
   /**
    The getBalance method returns the account balance.
    @return The account balance.
    */
   public double getBalance()
   {
      return balance; 
   }
   /**
    The getInterestRate method returns the annual
    interest rate.
    @return The annual interest rate.
    */
   public double getInterestRate()
   {
      return interest; 
   }
   /**
    The getLastInterest method returns the last amount
    of interest earned.
    @return The last amount of interest earned.
    */
   public double getInterest()
   {
      return totalInterest; 
   }
}

