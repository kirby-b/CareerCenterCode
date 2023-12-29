import java.util.Scanner;

public class Main {

    /* ===========================================================
    ===== Challenge 11-2 - TestScores Class Custom Exception =====
    ==============================================================

    Write an exception class named InvalidTestScore. Modify the TestScores class you
    wrote in Programming Challenge 11-1 so that it throws an InvalidTestScore exception
    if any of the test scores in the array are invalid.

    THIS CLASS IS COMPLETE AND CORRECT. DO NOT CHANGE IT.

     */

    public static void main(String[] args) {
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

        try
        {
            TestScores tBad = new TestScores(badScores);
            // The following statement should not execute.
            System.out.println("The average of the bad scores is " +
                    tBad.getAverage());
        }
        catch (InvalidTestScore e)
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
        catch (InvalidTestScore e)
        {
            System.out.println("Invalid score found.\n" + e.getMessage());
        }
    }
    // Malicious Compliance
}
