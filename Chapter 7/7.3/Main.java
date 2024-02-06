import java.util.Scanner;

public class Main {
    /* ==============================================
    ===== Challenge 7-6 - Driver's License Exam =====
    =================================================

    The local Driver's License Office has asked you to write a program that grades the written
    portion of the driver's license exam. The exam has 20 multiple choice questions. Here are
    the correct answers:

        1. B    6. A    11. B   16. C
        2. D    7. B    12. C   17. C
        3. A    8. A    13. D   18. B
        4. A    9. C    14. A   19. D
        5. C   10. D    15. D   20. A

    A student must correctly answer 15 of the 20 questions to pass the exam.

    Write a class named DriverExam that holds the correct answers to the exam in an array field.
    The class should also have an array filed that holds the student's answers. The class should
    have the following methods:

        - passed. Returns true if the student passed the exam, or false if the student failed
        - totalCorrect. Returns the total number of correctly answered questions
        - totalIncorrect. Returns the total number of incorrectly answered questions
        - questionsMissed. An int array containing the question numbers of the questions that
          the student missed.

     Demonstrate the class in a complete program that asks the user to enter the student's answers,
     and then displays the results returned from the DriverExam class's methods.

     *Input Validation: Only accept the letters A, B, C, or D as answers.*
     */

    public static void main(String[] args) {
        // To hold keyboard input
        Scanner keyboard = new Scanner(System.in);
        // Number of answers
        // Array to hold answers
        char[] ans = new char[20];
        // Array to hold missed questions
        int[]missed = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        // Create a Scanner object for keyboard input.

        // Get the user's answers to the questions.
        System.out.println("Enter your answers to the exam questions. (Make sure Caps Lock is ON!)");
        for (int i = 1; i < 21; i++)
            {
                Boolean go = false;
                String check = "";
                char answer;
                System.out.print("Question "+ i +": ");
                check = keyboard.nextLine();
                answer = check.charAt(0);
                go = valid(check);
                while ( go == true)
                {
                    System.out.print("ERROR: Valid answers are A, B, C, or D.\n");
                    System.out.print("Question "+ i +": ");
                    check = keyboard.nextLine();
                    go = valid(check);
                }
                answer = check.charAt(0);
                ans[i - 1] = answer;
            }
            // Validate the answer.
            
        // Create a DriverExam object.
            DriverExam test = new DriverExam(ans);
            
        // Get an array of the missed question numbers.
                String result = "";
                if (test.passed() == true)
                {
                    result = "You passed the exam.";
                }
                else if (test.passed() == false)
                {
                    result = "You failed the exam.";
                }
                missed = test.questionsMissed();
                System.out.println("Correct answers: "+ test.totalCorrect() +"\nIncorrect answers: "+ test.totalIncorrect()+"\n"+result+"\nYou missed the following questions:");
                for (int i = 0; i < missed.length; i++)
                {   if (missed[i] == 0)
                    {
                        break;
                    }
                    System.out.print(missed[i]+" ");
                }
                keyboard.close();
        // Display a report.
            
 
    }

    /**
     The valid method validates a character as an
     answer for the test.
     @param c The character to validate.
     @return true if the argument is A, B, C, or D.
     false otherwise.
     */
    public static boolean valid(String c)
    {
        
        boolean val = true;
        
        if (c.equals("A") || c.equals("B") || c.equals("C")||c.equals("D"))
        {
            val = false;
            
        }
        else
        {   
            val = true;
            

        }
        
        return val;
    }
}
