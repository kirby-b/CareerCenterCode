import java.util.Scanner;

public class Main {

    /* ==========================================
    ===== Challenge 9.2 - Password Verifier =====
    =============================================

    Imagine you are developing a software package for Amazon.com that requires users to enter
    their own passwords. Your software requires that user's passwords meet the following
    criteria:

        - The password should be at least six characters long.
        - The password should contain at least one uppercase and at least one lowercase letter.
        - The password should have at least one digit.

    Write a class that verifies that a password meets the stated criteria. Demonstrate the class in
    a program that allows the user to enter a password and then displays a message indicating
    whether it is valid or not.

     */

    // This file file is provided and correct.
    // No changes are required.

    public static void main(String[] args) {
        String input;  // To hold keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Get a password string.
        System.out.println("Enter a password");
        input = keyboard.nextLine();

        PasswordVerifier pv = new PasswordVerifier();
        
        // Determine whether the password is valid or not.
        if (!pv.isValid(input))
            System.out.println("Invalid password.");
        else
            System.out.println("Valid password");

        // Exit the applicaton.
        System.exit(0);
    }
}
