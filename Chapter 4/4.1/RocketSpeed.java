import java.util.Scanner;

public class RocketSpeed {

    /* =====================================
    ===== Challenge 4.1 - Rocket Speed =====
    ========================================

    It is now time to get familiar with a little orbital mechanics. The first thing we need
    you to do is a simple calculation for how long we need to do a burn in order to get to
    the correct speed.

    Our fully loaded rocket doubles its speed every second starting at 100m/s. We need you 
    to write a program that calculates the speed that the rocket is traveling at based on 
    how many seconds we input as a potential burn. The output should be displayed in km/s.
    The output should also provide us with a chart to show us the speed after different
    numbers of seconds in case we guess to high.

    Example: 1 second  = .1km/s
             2 seconds = .2km/s
             3 seconds = .4km/s
             4 seconds = .8km/s
             5 seconds = 1.6km/s
            
    We also want to make sure that nobody tries to put in a negative value or any non-number 
    characters. Please make sure that you include input validation to prevent them from doing that. - if seconds not bigger than or equal to 1

    Things you need to pass the tests:

    Input 1 - "How many seconds is the burn?"
    Failed Validation - "The number of seconds must be at least 1.\n How many seconds is the burn?"
    Report Header - "Seconds\t\tTotal Speed"
    Report Line - "[seconds]\t\t[speed]"
    Output - "Final speed:\t [totalSpeed/1000] km/s"
     */

    public static void main(String[] args) {

        // Variables declared and initialized and Scanner 
        // Get the maximum number of seconds.
        // Close the keyboard
        // Validate the input.  
        // Display the report header.
        // Display the speed report using a while loop.
            // Display the seconds number and speed of the rocket.
            // Increment for the next second.
            // Accumulate the total speed.
            // Double the speed.
        // Display the total pay.
        // Close the program
        Scanner keyboard = new Scanner(System.in);
        int seconds = 0;
        double speed = 0.1;
        double totalSpeed = 0;
        int end = 0;
        System.out.println("How many seconds is the burn?");
        seconds = keyboard.nextInt();
        while (!(seconds >= 1))
        {
            System.out.println("The number of seconds must be at least 1.\n How many seconds is the burn?");
            seconds = keyboard.nextInt();
        }
            
        System.out.print ("Seconds\t\tTotal Speed");
        while (end != seconds)
        {
            
            System.out.printf("\n" + (end + 1) + "\t\t" + "%,.1f" + " km/s", speed);
            totalSpeed = speed;
            speed = speed * 2;
            end++;
            
        }
        System.out.printf("\nFinal speed:\t" + "%,.1f" + " km/s", totalSpeed);
    }
}
