// Create a class named TestScores
class TestScores
{
    // Create a variable named scores to hold a double array
    double[] scores;

    // Create a method named TestScores that accepts a double array and throws an IllegalArgumentException
    public TestScores (double[] a)
    {
        // Set scores to the length of the array
        scores = new double[a.length];
        // Copy the scores passed as an argument into the new scores array
        double pos = 0;
        for(int i = 0; i < a.length; i++)
        {
            pos = a[i];
        // Make sure to check for illegal values (<100 or >0) as you step through the loop
        // If an error is found, output the following:
            // "Element: (element number) Score: (value for the element)"
        // Otherwise
            // Actually perform the copy
            if (pos > 100 || pos < 0)
            {
                throw new IllegalArgumentException("Element: " + i + " Score: " + pos);
            }
            else
            {
                scores[i] = pos;
            }

        }
    }
    // Create a method named getAverage that returns a double
    public double getAverage()
    {
        // Create a double named total and set it to 0
        double total = 0;
        // Use a loop to accumulate the test scores in the array
        for(int i = 0; i < scores.length; i++)
        {
            total = total + scores[i];
        }
        // Return the total divided by the number of scores to get an average.
        return total / (scores.length);
    }
}