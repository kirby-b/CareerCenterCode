import java.util.Scanner;

/*============================================
===== Challenge 4.4 - StarFieldGenerator =====
==============================================
 
We're going to start the process of making star charts now. This is one
of those things that wont make a whole lot of sense right now, but when
we get to chapter 7 you will understand why we did this. So, we need you
to write a piece of software that creates a square field of "X's"

The program should ask the uer to enter a number between 1 and 15 and then
displays a box made of "X's" that is as wide and tall as the user entered.
In order to make it look nicer, put a space after each "X."

If the user enters 5, the box should look like this:
X X X X X
X X X X X
X X X X X
X X X X X
X X X X X

If the user enters 8, the box should look like this:
X X X X X X X X
X X X X X X X X
X X X X X X X X
X X X X X X X X
X X X X X X X X
X X X X X X X X
X X X X X X X X
X X X X X X X X

Things you will need to pass the tests:
Input 1 - "How big do you want the star field to be? (1-15)"
Output Error 1.1 - "Sorry, that's an invalid number."
Output Error 1.2 - "How big do you want the star field to be? (1-15)"
Output - A bunch of X's
   
*/

public class StarFieldGenerator
{
   public static void main(String[] args)
   {
      int size = 0, end = 0 ,linenext = 0;
      // Variable for user input
      
      // Create a Scanner object for keyboard input.
      
      // Get a number from the user.
      
      // Validate the input.

      // Close the keyboard

      // Display the square made of Xs.
      // The outer loop displays the rows.

         // The inner loop displays each
         // X in the row.

         // Advance to the next line.

      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter an integer in the range of 1-15: ");
      size = keyboard.nextInt();
      while (size < 1 || size > 15)
         {
         System.out.print("Sorry, that's an invalid number.\nEnter an integer in the range of 1-15: ");
         size = keyboard.nextInt();
         }
         

      while (end != size)
         {
         while (linenext != size)
         {
            System.out.print("X ");
            linenext++;
         }
         System.out.print("\n");
         linenext = 0;
         end++;
         }
         

         
   }
}