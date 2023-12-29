import java.util.Scanner;

public class GForceTest {

    /* =====================================
    ===== Challenge 5.2 - G-Force Test =====
    ========================================

    We need to figure out how many G's our astronauts can handle and apply a grade of,
    "Excel, Pass, or Fail" depending on what those scores are when we put them in the
    centrifuge. Write a program that asks the user to enter the G's applied when the 
    astronaut candidate passes out. The program should display a grade for each test.
    It should then get the average score and display it in G's and give a total grade.
    If somehow, the astronaut makes it past 9.0 G's, the centrifuge should shut down
    automatically as it is dangerous for the astronaut to endure more than 9.0 G's and
    you should output a warning notification so that our staff can correct the problem.
    
    Use the following methods in the program.
    - calcAverage - This method should accept the five scores as arguments and return
      the average of the scores.
    - determineGrade - This method should accept a score as an argument and return a
      grade for the score based on the following score:

    Score       Grade
    ==================
    Over 9.1    Warning
    6.1-9.0     Excel
    3.1-6.0     Pass
    1.0-3.0     Fail

    Things you will need to pass the tests:
    Input 1 - "Enter the first score: "
    Input 2 - "Enter the second score: "
    Input 3 - "Enter the third score: "
    Input 4 - "Enter the fourth score: "
    Input 5 - "Enter the fifth score: "
    Output 1 - "Here are the grades and the average:
                Score 1: [grade1]
                Score 2: [grade2]
                Score 3: [grade3]
                Score 4: [grade4]
                Score 5: [grade5]
                Average score: [averageScore]
                Average Grade: [averageGrade]

    All calculations should round to the second decimal.

     */

    public static void main(String[] args) {

        // Create variables and scanner object.
        // Get the five test scores in order.
        // Get the average.
        // Display the grades, average, and average grade.
       
        double average = 0;
        double score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the first score: ");
        score1 = keyboard.nextDouble();
        System.out.print("Enter the second score: ");
        score2 = keyboard.nextDouble();
        System.out.print("Enter the third score: ");
        score3 = keyboard.nextDouble();
        System.out.print("Enter the fourth score: ");
        score4 = keyboard.nextDouble();
        System.out.print("Enter the fifth score: ");
        score5 = keyboard.nextDouble();
        System.out.println("Here are the grades and the average:");
        average = getAverage(score1 , score2 , score3, score4, score5 );
        determineGrade(score1, score2, score3, score4, score5, average);

    }
        public static double getAverage (double score1 , double score2 , double score3 , double score4 , double score5 ){
          double average = 0;
          average = (score1 + score2 + score3 + score4 + score5) / 5;
          return average;


    }
        public static void determineGrade( double score1 , double score2 , double score3 , double score4 , double score5, double average ){
          
            if (score1 >= 1 & score1 <= 3)
              System.out.println("Score 1: Fail");
            else if (score1 > 3 & score1 <= 6)
              System.out.println("Score 1: Pass");
            else if (score1 > 6 & score1 <= 9)
              System.out.println("Score 1: Excel");
            else if (score1 > 9)
              System.out.println("Score 1: Warning");

            if (score2 >= 1 & score2 <= 3)
              System.out.println("Score 2: Fail");
            else if (score2 > 3 & score2 <= 6)
              System.out.println("Score 2: Pass");
            else if (score2 > 6 & score2 <= 9)
              System.out.println("Score 2: Excel");
            else if (score2 > 9)
              System.out.println("Score 2: Warning");
            
            if (score3 >= 1 & score3 <= 3)
              System.out.println("Score 3: Fail");
            else if (score3 > 3 & score3 <= 6)
              System.out.println("Score 3: Pass");
            else if (score3 > 6 & score3 <= 9)
              System.out.println("Score 3: Excel");
            else if (score3 > 9)
              System.out.println("Score 3: Warning");

            if (score4 >= 1 & score4 <= 3)
              System.out.println("Score 4: Fail");
            else if (score4 > 3 & score4 <= 6)
              System.out.println("Score 4: Pass");
            else if (score4 > 6 & score4 <= 9)
              System.out.println("Score 4: Excel");
            else if (score4 > 9)
              System.out.println("Score 4: Warning");

            if (score5 >= 1 & score5 <= 3)
              System.out.println("Score 5: Fail");
            else if (score5 > 3 & score5 <= 6)
              System.out.println("Score 5: Pass");
            else if (score5 > 6 & score5 <= 9)
              System.out.println("Score 5: Excel");
            else if (score5 > 9)
              System.out.println("Score 5: Warning");

            System.out.printf("Average score: %.2f\n" ,average);
            
            if (average >= 1 & average <= 3)
              System.out.println("Average Grade: Fail");
            else if (average > 3 & average <= 6)
              System.out.println("Average Grade: Pass");
            else if (average > 6 & average <= 9)
              System.out.println("Average Grade: Excel");
            else if (average > 9)
              System.out.println("Average Grade: Warning");




    }

    /**
     The calcAverage method calculates the average of five scores.
     @param score1 The first score.
     @param score2 The second score.
     @param score3 The third score.
     @param score4 The fourth score.
     @param score5 The fifth score.
     @return The average of the five scores.
     */
      
    /**
     The determineGrade method determines the grade
     for a numeric score.
     @param score The numeric score.
     @return The grade.
     */

    // To hold the grade
    // Determine the grade.
  } 
