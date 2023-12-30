import java.util.Scanner;

public class Main {

    /* ========================================
    ===== Challenge 8.2 - LandTract Class =====
    ===========================================

    Make a LandTract class that has two fields: one for the tract's length and one for the width.
    The class should have a method that returns the tract's area, as well as an equals method
    and a toString method. Demonstrate the class in a program that asks the user to enter the
    dimensions for two tracts of land. The program should display the area of each tract of land
    and indicate whether the tracts are of equal size.

    Note: for this problem, I've given you a lot of the main class, but not all of it.
          places that you will need to input new code in this file are marked with a
          line of equal signs.

     */

    public static void main(String[] args) {
        double length; // To input a length
        double width;  // To input a width
        boolean sameYN;
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the dimensions of tract 1.
        System.out.println("TRACT 1:");
        System.out.print("Enter the length of Tract 1: ");
        length = keyboard.nextDouble();
        System.out.print("Enter the width of Tract 1: ");
        width = keyboard.nextDouble();

        // Create a LandTract object for tract 1
        LandTract tract1 = new LandTract(length, width);

        // Get the dimensions of tract 2.
        System.out.println("\nTRACT 2:");
        System.out.print("Enter the length of Tract 2: ");
        length = keyboard.nextDouble();
        System.out.print("Enter the width of Tract 2: ");
        width = keyboard.nextDouble();

        // Create a LandTract object for tract 2.
        LandTract tract2 = new LandTract(length, width);

        // Display the land tract data.
        System.out.println("\nTRACT 1:");
        System.out.println(tract1);
        System.out.println("TRACT 2:");
        System.out.println(tract2);

        // Determine whether the two tracts are equal.
        sameYN = tract1.equals(tract2);
            if ( sameYN == true)
            {
                System.out.print("The tracts are the same size.");
            }
            if (sameYN == false)
            {
                System.out.print("The tracts are NOT the same size.");
            }
                // If they are the same:
                // "The tracts are the same size."

                // If they are not the same:
                // "The tracts are NOT the same size."
    }
}
