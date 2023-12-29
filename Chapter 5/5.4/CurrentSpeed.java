import java.util.Scanner;

public class CurrentSpeed {

    /* ======================================
    ===== Challenge 5.4 - Current Speed =====
    =========================================

    Future speed
    Speed increase %
    How long until you reach your target speed
    your current speed is
    
    We need a way for astronauts to determine their current speed based on their rate of
    increase, how long they have to go until they are at the correct speed, and target
    speed. The formula to determine this is as follows:

    C = (T)/(1+R)^N

    The terms in the formula are as follows:

        - C is the current relative speed of the spacecraft in km/s.
        - T is the target speed that the spacecraft will end at km/s.
        - R is the percent increase per minute of the spacecraft's speed.
        - N is the number of minutes that are left until the spacecraft meets the target speed.

    Write a method named currentSpeed that performs this calculation. The method should accept
    the target speed value, percent increase per minute, and number of minutes as arguments.
    It should return the current speed of the spacecraft. Demonstrate the method in a program
    that lets our astronauts experiment with different values for the formula's terms.

    Things you need to pass the tests:
        Input 1 - Enter target speed: 
        Input 2 - Rate of speed increase per minute: divide by 100 becaue percent
        Input 3 - Minutes until target speed achieved: 
        Formula - current = target / (1 + rate)^minutes)
        Output - Current speed: [current](be sure to include 2 decimal places and commas)

     */

    public static void main(String[] args) {
        // Variables
        // Scanner
        // Get the target speed.
        // Get the rate of increase.
        // Get the number of minutes until the spacecraft reaches target speed.
        // Close the keyboard
        // Call the currentSpeed method
        // Display the result.
        double target = 0 , increase = 0, minutes = 0, current = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter target speed: ");
        target = keyboard.nextDouble();
        System.out.println("Rate of speed increase per minute: ");
        increase = keyboard.nextDouble();
        increase = increase/100;
        System.out.println("Minutes until target speed achieved: ");
        minutes = keyboard.nextDouble();
        current = speedIsKey(target, increase, minutes);
        System.out.printf("The current speed is %.2f", current);
    }

    // Declare your method accepting target, rate, and minutes
    public static double speedIsKey(double target, double rate, double minutes)
    {
       //System.out.println(target);
        //System.out.println(rate);
        //System.out.println(minutes);
        double current = 0;
        current = target / Math.pow((1 + rate), minutes);

        return current;
    }
    // Create a double for current speed
        // Calculate the current speed.
        // Return the current speed.
}

