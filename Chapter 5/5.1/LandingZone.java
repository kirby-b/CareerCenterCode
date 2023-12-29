import java.util.Scanner;

public class LandingZone {

    /* =====================================
    ===== Challenge 5.1 - Landing Zone =====
    ========================================

    We need some help calculating a landing zone. Our rockets are going up and 
    just coming down wherever. We're really worried that one is going to land on 
    someone. We need you to write a program that asks the user to enter the width
    and length apart that rockets have landed in feet, centered on the launch pad. 
    The program should then calculate the area that we need to ensure is clear so
    that no rockets land on anyone.

    The program should use the following methods which have not been written.

    - getLength - This method should ask the user to enter the length of the
      landing zone in feet and then return that value as a double.
    - getWidth - This method should ask the user to enter the width of the landing
      zone in feet and then return that value as a double.
    - getArea - This method should accept the landing zone's length and width as
      arguments and then return the total area for the landing zone. 
    - displayData - This method should accept the landing zone's length, width,
      and area as arguments. It should then display and incorporate them into an
      appropriate message on the screen.

    Things you will need to pass the tests:
    Input 1 - "Enter the landing zone's length in feet:"
    Input 2 - "Enter the landing zone's width in feet:"
    Area Calculation - [area] = [length] * [width]
    Output 1 - "The Landing zone's dimensions are as follows:
                Length  = [lenth]
                Width = [width]
                Area = [area]"
                
     */
    public static void main(String[] args) {
      // Create variables and keyboard scanner.
      displayData();
        // Get the landing zone's length from the user.
        // Get the landing zone's width from the user.
        // PROTIP - Put the keyboard scanner in the parantheses for your method calls

        // Close the keyboard
        // Get the landing zone's area.
        // Display the landing zone's data.
    }

    /**
    The getLength method prompts the user for the landing zone's length.
     @return The value entered by the user.
     */
    public static double getLength(double length){
      System.out.println("Enter the landing zone's length in feet:");
      return length;



    }
    // Define getLength method
      // Create a variable to hold an input for length
      // Get the input
      // Return the input

    /**
     The getWidth method prompts the user for the landing zone's width.
     @return The value entered by the user.
     */
    public static double getWidth(double width){
      System.out.println("Enter the landing zone's width in feet:");
      return width;
    }
    //Define getWidth method
      // Create a variable to hold an input for width
      // Get the input
      // Return the input

    // PROTIP - Put "scanner keyboard" in yhe parantheses for your method definitions
    
    /**
     The getArea method calculates the landing zone's area.
     @param length The landing zone's length.
     @param width The landing zone's width.
     @return The area of the landing zone.
     */
    public static double getArea(double width, double length){
      double area = 0;
      area = length * width;
      return area;



    }
    // Define tha getArea method that accepts the length and width arguments
      // Return the value for length times width.

    /**
     The displayData displays the landing zone's length, width, and area.
     @param length The landing zone's length.
     @param width The landing zone's width.
     @param area The landing zone's area.
     */
    public static void displayData(){
      double area = 0;
      double width = 0;
      double length = 0;
      Scanner keyboard = new Scanner(System.in);
      length = getLength(width = keyboard.nextDouble());
      width = getWidth(width = keyboard.nextDouble());
      area = getArea(width, length);
      System.out.println("The Landing zone's dimensions are as follows:\nLength  = " + length + "\nWidth = "+ width + "\nArea  = " + area );
      keyboard.close();
      



    }
    // Define the displayData method that accepts lenght, width, and area
      // Display the output.
  }