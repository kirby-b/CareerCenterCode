import java.util.Scanner;

public class Main {

    /* ==================================================
    ===== Challenge 7-3 - Charge Account Validation =====
    =====================================================

    Create a class with a method that accepts a charge account number as its argument. The
    method should determine whether the number is valid by comparing it to the following
    list of valid charge account numbers.

        5658845     4520125     7895122     8777541     8451277     1302850
        8080152     4562555     5552012     5050552     7825877     1250255
        1005231     6545231     3852085     7576651     7881200     4581002

    The numbers should be stored in an array or in an ArrayList object. Use a sequential search
    to locate the number passed as an argument. If the number is in the array, the method should
    return true, indicating the number is valid. If the number is not in the array, the method
    should return false, indicating the number is invalid.

    Write a program that tests the class by asking the user to enter a charge account number.
    The program should display a message indicating whether the number is valid or invalid.

     */

    public static void main(String[] args) {
        // To hold keyboard input
        int account = 0;
        boolean valid = false;
        // Account number to validate
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your charge account number: ");
        account = keyboard.nextInt();
        // Create a Validator object.
        Validator charge = new Validator();
        // Get a charge account number.
        valid = charge.isValid(account);
        // Determine whether it is valid.
        keyboard.close();
        if (valid == true)
        {
            System.out.print("That's a valid account number.");
        }
        if (valid == false)
        {
            System.out.print("That's an INVALID account number.");
        }
    }
}
