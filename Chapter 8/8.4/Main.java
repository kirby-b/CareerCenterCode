import java.util.Scanner;

public class Main {

    /* ============================================
    ===== Challenge 8.4 - Geometry Calculator =====
    ===============================================

    Design a geometry class with the following methods:

    - A static method that accepts the radius of a circle and returns the area of the circle.
      Use the following formula:

        Area = pi * (radius * radius);
        Use Math.PI for pi and the radius of the circle for radius

    - A static method that accepts the length and width of a rectangle and returns the area
      of the rectangle. Ue the following formula:

        Area = Length * Width

    - A static method that accepts the length of a triangle's base and the triangle's height.
      The method should return the area of the triangle. Use the following formula:

        Area = Base * Height * 0.5

    The methods should display an error message if negative values are used for the circle's
    radius, the rectangle's length or width, or the triangle's base or height.

    Next, write a program to test the class, which displays the following menu and responds to
    the user's selection:

        Geometry Calculator
        1. Calculate the Area of a Circle
        2. Calculate the Area of a Rectangle
        3. Calculate the Area of a Triangle
        4. Quit

        Enter your choice (1-4):

    Display an error message if the user enters a number outside the range of 1 through 4
    when selecting an item from the menu.

    // Part of this class is provided.
    // Pieces that you need to fill in are marked with equals signs

     */

    public static void main(String[] args) {
        char again;       // Indicates whether to run again
        int choice;       // The user's menu choice
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        do
        {
            // Get the user's menu choice.
            choice = getMenuChoice(keyboard);

            // Do what the user requested.
            switch(choice)
            {
                case 1 : circle(keyboard);
                    break;
                case 2 : rectangle(keyboard);
                    break;
                case 3 : triangle(keyboard);
                    break;
                case 4 : System.out.println("Goodbye!");
            }
        } while (choice != 4);
    }

    /**
     The getMenuChoice method displays a menu
     of choices for the user.
     */

    public static int getMenuChoice(Scanner keyboard)
    {
        int choice;    // The user's choice.

        // Display the menu.
        System.out.println("Geometry Calculator\n");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit\n");
        System.out.print("Enter your choice (1-4) : ");

        // Get the user's selection.
        choice = keyboard.nextInt();

        // Validate the selection.
        while (choice < 1 || choice > 4)
        {
            System.out.print("Error: Enter 1, 2, 3, or 4: ");
            choice = keyboard.nextInt();
        }

        return choice;
    }

    /**
     The circle method determines the area of a circle.
     */

    public static void circle(Scanner keyboard)
    {
        double rad;          // The radius of the circle

        // Get the circle's radius.
        System.out.print("What is the circle's radius? ");
        rad = keyboard.nextDouble();

        
        // Display the circle's area.
        System.out.println("The circle's area is " + Geometry.circleArea(rad));
                // USe the geometry class to calculate the area of the circle
                // ==========================================================
    }

    /**
     The rectangle method determines the area of a rectangle.
     */

    public static void rectangle(Scanner keyboard)
    {
        double len;          // The length of the rectangle
        double width;        // The width of the rectangle

        // Get the rectangle's length.
        System.out.print("What is the rectanlge's length? ");
        len = keyboard.nextDouble();

        // Get the rectangle's width.
        System.out.print("What is the rectanlge's width? ");
        width = keyboard.nextDouble();

        
        // Display the rectangle's area.
        System.out.println("The rectangle's area is " + Geometry.rectangleArea(len, width));
                // Use the Geometry class to calculate the area of the rectangle
                // =============================================================
    }

    /**
     The triangle method determines the area of a triangle.
     */

    public static void triangle(Scanner keyboard)
    {
        double base;         // The triangle's base
        double height;       // The triangle's height

        // Get the base of the trianlge.
        System.out.print("What is the length of the triangle's base? ");
        base = keyboard.nextDouble();

        // Get the height of the triangle.
        System.out.print("What is the triangle's height? ");
        height = keyboard.nextDouble();

        
        // Display the triangle's area.
        System.out.println("The triangle's area is " + Geometry.triangleArea(base, height));
                // Use the geometry class to calculate the area of the triangle
                // ============================================================
    }
}