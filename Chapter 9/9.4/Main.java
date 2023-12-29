import java.util.Scanner;

public class Main {

    /* ===============================================================
    ===== Challenge 9.4 - Alphabetic Telephone Number Translator =====
    ==================================================================

    Many companies use telephone numbers like 555-GET-FOOD so the number is easier for
    their customers to remember. On a standard telephone the alphabetic letters are mapped
    to numbers in the following fashion:

        A, B, and C = 2
        D, E, and F = 3
        G, H, and I = 4
        J, K, and L = 5
        M, N, and O = 6
        P, Q, R, and S = 7
        T, U, and V = 8
        W, X, Y, and Z = 9

    Write an application that asks the user to enter a 10-character telephone number in the
    format XXX-XXX-XXXX. The application should display the telephone number with any
    alphabetic characters that appeared in the original translated to their numeric equivalent.
    For example, if the user enters 555-GET-FOOD the application should display 555-438-3663.

     */

    // This file is complete and correct. Do not change it.

    public static void main(String[] args) {
        // Create a Scanner object to read
        // keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get a phone number.
        System.out.print("Enter a phone number containing " +
                "alphabetic characters: ");
        String phone = keyboard.nextLine();

        // Create an instance of the PhoneTranslator class.
        PhoneTranslator pt = new PhoneTranslator(phone);

        // Display the numeric version of the number.
        System.out.println("The numeric version of that number is " +
                pt.getTranslated());
    }
}
