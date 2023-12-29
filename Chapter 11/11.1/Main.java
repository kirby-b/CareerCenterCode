import java.util.Scanner;

public class Main {

    /* ==========================================
    ===== Challenge 11-1 - TestScores Class =====
    =============================================

    Write a class named TestScores. The class constructor should accept an array of test scores
    as its argument. The class should have a method that returns the average of the test scores.
    If any test score in the array is negative or greater than 100, the class should throw an
    IllegalArgumentException. Demonstrate the class in a program.

    THIS CLASS IS COMPLETE AND CORRECT. DO NOT MODIFY IT.

     */

    public static void main(String[] args) {
        // An array with test scores.
        // Notice that element 3 contains an invalid score.

        // Create arrays and scanner object
        double[] badScores = new double[5];
        double[] goodScores = new double[5];
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter five numerical scores, making sure one is invalid.");
        System.out.println("Press enter after each number.");
        badScores[0] = keyboard.nextDouble();
        badScores[1] = keyboard.nextDouble();
        badScores[2] = keyboard.nextDouble();
        badScores[3] = keyboard.nextDouble();
        badScores[4] = keyboard.nextDouble();

        System.out.println("Now, enter five numerical scores making sure that they are all valid.");
        System.out.println("Press enter after each number.");
        goodScores[0] = keyboard.nextDouble();
        goodScores[1] = keyboard.nextDouble();
        goodScores[2] = keyboard.nextDouble();
        goodScores[3] = keyboard.nextDouble();
        goodScores[4] = keyboard.nextDouble();

        // Create a TestScores object initialized with badScores.
        try
        {
            TestScores tBad = new TestScores(badScores);
            // The following statement should not execute.
            System.out.println("The average of the bad scores is " +
                    tBad.getAverage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid score found.\n" + e.getMessage());
        }

        // Create a TestScores object initialized with goodScores.
        try
        {
            TestScores tGood = new TestScores(goodScores);
            System.out.println("The average of the good scores is " +
                    tGood.getAverage());
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Invalid score found.\n" + e.getMessage());
        }
    }
}
