public class Main {

    /* ===========================================================
    ===== Challenge 8.1 - BankAccount Class Copy Constructor =====
    ==============================================================

    Add a copy constructor to the BankAccount class. This constructor should accept a
    BankAccount object as an argument. It should assign to the balance field the value in the
    argument's balance field. As a result, the new object will be a copy of the argument object.

     */

    public static void main(String[] args) {
        // Create a BankAccount object with a
        // balance of $1200.00.
        BankAccount account1 = new BankAccount(1200);

        // Create another BankAccount object as a
        // copy of the first.
        BankAccount account2 = account1;
        // Display the balance in each account.
        System.out.printf("The balance in account #1 is $%,.2f\n",
                account1.getBalance());
        System.out.printf("The balance in account #2 is $%,.2f\n",
                account2.getBalance());
    }
}
