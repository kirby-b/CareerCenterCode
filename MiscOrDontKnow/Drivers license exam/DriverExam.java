

public class DriverExam
{
    // Array of correct answers to the exam
    private char[] correctAnswers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};

    // Array to hold the student's answers
    private char[] studentAnswers = new char[20];

    // Constructor
    public DriverExam(char[] answers)
    {
        // Set the student's answers
        studentAnswers = answers;
    }

    // Method that returns true if the student passed the exam
    public boolean passed()
    {
        // Count the number of correct answers
        int correctCount = totalCorrect();

        // The student must have 15 or more correct answers to pass
        if (correctCount >= 15)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Method that returns the total number of correctly answered questions
    public int totalCorrect()
    {
        int correctCount = 0;

        // Loop through the student's answers and compare them to the correct answers
        for (int i = 0; i < correctAnswers.length; i++)
        {
            if (studentAnswers[i] == correctAnswers[i])
            {
                correctCount++;
            }
        }

        return correctCount;
    }

    // Method that returns the total number of incorrectly answered questions
    public int totalIncorrect()
    {
        return 20 - totalCorrect();
    }

    // Method that returns an array of the question numbers that the student missed
    public int[] questionsMissed()
    {
        // Create an array to hold the question numbers that the student missed
        int[] missed = new int[totalIncorrect()];

        // Loop through the student's answers and compare them to the correct answers
        // Keep track of the question number that the student missed
        int missedIndex = 0;
        for (int i = 0; i < correctAnswers.length; i++)
        {
            if (studentAnswers[i] != correctAnswers[i])
            {
                missed[missedIndex] = i + 1;
                missedIndex++;
            }
        }

        return missed;
    }
}
