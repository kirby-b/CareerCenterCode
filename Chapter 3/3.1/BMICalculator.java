import java.util.Scanner;

public class BMICalculator {

    /* ========================================
    ===== Challenge 3.1 - Body Mass Index =====
    ===========================================

    We need to make sure that our astronauts are in excellent shape
    before they go into space. Every extra pound that they weigh costs
    us an extra $10,000 to get them to space. 

    We need you to write a program that helps us to calculate their 
    body mass index (BMI). We can not fault them for their weight in 
    pounds since taller people just weigh more. What we can do is 
    make sure that we are sending up healthy astronauts and BMI
    allows us to do just that. 

    To calculate a person's BMI, use the following formula:

    bmi = weight * 703/(height * height)

    For this challenge, height should be measured in inches and weight
    should be measured in pounds. Your program should tell us if a person
    is overweight (bmi over 25), underweight (bmi under 18.5), or if their
    bmi is normal (bmi between 18.5 and 25). 

    Things you will need to pass the tests:

    Intro Text - "This program will calculate an astronaut's BMI."
    Prompt 1 - "Enter the astronaut's weight, in pounds: "
    Prompt 2 - "Enter the astronaut's height, in inches: "
    Output 1 - "The astronaut's BMI is [bmi]."
    Output 2 (if underweight) - "The astronaut is underweight."
    Output 2 (if overweight) - "The astronaut is overweight."
    Output 2 (if ideal) - "The astronaut's weight is optimal."

     */

    public static void main(String[] args) {
        // Variables for height (in inches), weight (in pounds), and BMI.
        double height;
        double weight;
        
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Tell the user what the program will do.
        System.out.println("This program will calculate an astronaut's BMI.");
        // Get the astronaut's weight.
        System.out.print("Enter the astronaut's weight, in pounds: ");
        weight = keyboard.nextDouble();
        // Get the astronaut's height.
        System.out.print("Enter the astronaut's height, in inches: ");
        height = keyboard.nextDouble();
        // Close the keyboard scanner out.

        // Calculate the astronaut's body mass index.
        double bmi = weight * 703 / (height * height);
        // Display the astronaut's BMI to two decimal places.
        // Hint, use printf();
        System.out.printf("The astronaut's BMI is %.2f.\n", bmi );
        // Determine whether the astronaut is underweight,
        // overweight, or has optimal weight.
        if (bmi > 25)
            System.out.println("The astronaut is overweight.");
        else if (bmi < 18.5)
            System.out.println("The astronaut is underweight.");
        else
            System.out.println("The astronaut's weight is optimal.");

    }
}
