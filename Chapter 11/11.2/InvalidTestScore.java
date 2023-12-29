// Create a class called InvalidTestScore that extends Exception
class InvalidTestScore extends Exception
{
    // Create a no-arg constructor named InvalidTestScore
    public InvalidTestScore()
    {
        // Return "Invalid test score"
        super("Invalid test score");
    }
    // Create a constructor named InvalidTestScore that accepts a question number and a score
    public InvalidTestScore (int n, double s)
    {
        // Use the super method with the following arguments:
        // "Element: (question number) Invalid Score: (score)"
        super("Element: " + n + " Invalid Score: " + s);

    }
}