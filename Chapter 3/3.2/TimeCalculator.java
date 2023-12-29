import java.util.Scanner;

public class TimeCalculator {

    /* ========================================
    ===== Challenge 3.2 - Time Calculator =====
    ===========================================

    Our software currently tells us how long we need to turn our engines on in seconds.
    That's great, but it isn't very easy for our astronauts to work with while in space.
    We need you to write a program that converts seconds to minutes, hours, and days.

    Write a program that asks the user to enter a number of seconds.

    - There are 60 seconds in a minute. If the number of seconds entered by the user is
      greater than or equal to 60, the program should display the number of minutes in that
      many seconds.
    - There are 3,600 seconds in an hour. If the number of seconds entered by the user is
      greater than or equal to 3,600, the program should display the number of hours in
      that many seconds.
    - There are 86,400 seconds in a day. If the number of seconds entered by the user is
      greater than or equal to 86,400, the program should display the number of days in
      that many seconds.

    Things you need to pass the tests:
    Input 1 - "Enter the number of seconds for this burn."
    Formula 1 (Days) - seconds/86400
    Formula 2 (Hours) - seconds/3600
    Formula 3 (Minutes) - seconds/60
    Output - "Burn for [days] day(s), [hours] hour(s), [minutes] minute(s), [seconds] second(s)."

    */

    public static void main(String[] args) {
        // Create ints for seconds, minutes, hours, and days. Initialize them all to "0."
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        int days = 0;
        // Create a string for input.
        // Create a scanner.
        Scanner keyboard = new Scanner(System.in);
        // Ask, "Enter the number of seconds"
        System.out.println("Enter the number of seconds for this burn.");
        seconds = keyboard.nextInt();
        // Read the input to input

        // Parse the input to seconds

        // Close keyboard input
        // Do the math for days
        if (seconds > 86400){
          days = seconds / 86400;
          seconds = seconds - (days * 86400);
        }
          
        // Do the math for hours
        if (seconds > 3600){
          hours = seconds / 3600;
          seconds = seconds - (hours * 3600);
        }
          
        // Do the math for minutes
        if (seconds > 60){
          minutes = seconds / 60;
          seconds = seconds - (minutes * 60);
        }
          
        // Output the answer
        System.out.println("Burn for "+days+" day(s), "+hours+" hour(s), "+minutes+" minute(s), "+seconds+" second(s).");
        // Exit the applicaton
    }
}
