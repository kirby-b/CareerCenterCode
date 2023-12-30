// Create a class named BankAccount
public class BankAccount{
    // Create a double named balance
    private double balance;
    // Create a no-arg constructor named BankAccount
        // Set balance to 0.0
    public BankAccount()
    {
        balance = 0;
    }
    // Create a constructor named BankAccount that accepts a BankAccount object
        // Set balance to the balance of the BankAccount object
    public BankAccount(BankAccount amount)
    {
        balance = amount.getBalance();
    }
    // Create a constructor named BankAccount that accepts a double
        // Set balance to the user's entered double
    public BankAccount(double amount)
    {
        balance = amount;
    }
    // Create a constructor named BankAccount that accepts a string
        // Set balance to the user's entered string parsed as a double
    public BankAccount(String amount)
    {
        balance = Integer.parseInt(amount);
    }
    // Create a void method for deposits that accepts a double for the amount
        // Set balance to balance + the amount entered
    public void deposits(double amount)
    {
        balance = balance + amount;
    }
    // Create a void method for deposits that accepts a string for the amount
        // Set balance to balance + the amount entered parsed as a double
    public void deposits(String amount)
    {
        balance = balance + Integer.parseInt(amount);
    }
    // Create a void method for withdrawals that accepts a double for the amount
        // Set balance to balance - the amount entered
    public void withdraws(double amount)
    {
        balance = balance - amount;
    }
    // Create a void method for withdrawals that accepts a string for the amount
        // Set balance to balance - the amount entered parsed as a double
    public void withdrawals(String amount)
    {
        balance = balance - Integer.parseInt(amount);
    }
    // Create a void method named setBalance that accepts a double
        // Set balance to the amount entered
    public void setBalance (double amount)
    {
        balance = amount;
    }
    // Create a void method named setBalance that accepts a string
        // Set balance to the amount entered parsed to a double
    public void setBalance(String amount)
    {
        balance = Integer.parseInt(amount);
    }
    // Create a method that returns a double named getBalance and accepts no arguments
        // Return the balance
    public double getBalance()
    {
        return balance;
    }
}