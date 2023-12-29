import java.util.Scanner;

public class engineTest {

    /* ========================================
    ===== 2.3 Engine Test Fuel Calculator =====
    ===========================================

    We need help to figure out how much fuel our different engines need for 
    our engine tests based on time. In order to calculate this, we will use 
    the following equation where fuel is measured in pounds:

    fuelRequired = fuelPerSecond * burnTime

    Write a porogram that asks the user for the fuel per second that the engine 
    uses at full thrust and the duration of the burn. It should calculate the
    amount of fuel required for the test. Make sure that the program closes
    after the calculation is complete.

    Things you will need to pass the tests:
    Prompt 1 - "How many pounds of fuel does the engine use per second?"
    Prompt 2 - "For how many seconds will the engine be on?"
    Formula - fuelRequired = fuelPerSecond * burnTime
    Output - "You need [fuelRequired] pounds of fuel."

     */

    public static void main(String[] args) {    
        
        // Create a scanner object for the keyboard.
        // Get the fuel per second used.
        // Get the length of the burn in seconds.
        // Calculate the amount of fuel required.
        // Display the fuel required.
        // Exit the program.
        double fuelPerSecond;
        int burnTime;
        double fuelRequired;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many pounds of fuel does the engine use per second?");
        fuelPerSecond = keyboard.nextDouble();
        System.out.println("For how many seconds will the engine be on?");
        burnTime = keyboard.nextInt();
        fuelRequired = fuelPerSecond * burnTime;
        System.out.println("You need " + fuelRequired +" pounds of fuel.");

        
    }
}