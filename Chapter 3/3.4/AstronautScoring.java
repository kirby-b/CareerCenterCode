import java.util.Scanner;

public class AstronautScoring {

    /* ==========================================
    ===== Challenge 3.3 - Astronaut Scoring =====
    =============================================

    We need to figure out who is going to captain the ship and the best way to
    do that is through scoring. We've figured out the scoring system, but we
    want to have software that ranks the astronauts once we put their scores in.

    Please create a program that asks for the names of three astronauts and their
    score out of 100 on the astronaut exam. The program should display the names
    of the three astronauts ranked from highest to lowest.

    Things you need to pass the tests:
    Input 1 - "Enter the first astronaut's name: "
    Input 2 - "Enter the first astronaut's score: "
    Input 3 - "Enter the second astronaut's name: "
    Input 4 - "Enter the second astronaut's score: "
    Input 5 - "Enter the third astronaut's name: "
    Input 6 - "Enter the third astronaut's score: "
    Output 1 - "Highest score: [astronaut(x)]"
    Output 2 - "Second highest score: [astronaut(y)]"
    Output 3 - "Third highest score: [astronaut(z)]"

     */

    public static void main(String[] args) {
        // Create variables
        String astronaut1 , astronaut2 , astronaut3;
        int score1 , score2 , score3;
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Display intro.     

        // Get the first astronaut's data.
        System.out.println("This program helps us to rank astronauts from highest to lowest");
        System.out.println("Enter the first astronaut's name: ");
        astronaut1 = keyboard.nextLine();
        System.out.println("Enter the first astronaut's score: ");
        score1 = keyboard.nextInt();
        // Get the second astronaut's data.
        System.out.println("Enter the second astronaut's name: ");
        astronaut2 = keyboard.nextLine();
        astronaut2 = keyboard.nextLine();
        System.out.println("Enter the second astronaut's score: ");
        score2 = keyboard.nextInt();
        // Get the third astronaut's data.
        System.out.println("Enter the third astronaut's name: ");
        astronaut3 = keyboard.nextLine();
        astronaut3 = keyboard.nextLine();
        System.out.println("Enter the third astronaut's score: ");
        score3 = keyboard.nextInt();
        // Close the keyboard scanner

        // Determine the first place astronaut.
        if (score1 > score2 && score2 > score3){
            System.out.println("Highest score: " + astronaut1 );
            System.out.println("Second highest score: " + astronaut2 );
            System.out.println("Third highest score: " + astronaut3 );
        }
            
        if (score1 > score3 && score3 > score2){
            System.out.println("Highest score: " + astronaut1 );
            System.out.println("Second highest score: " + astronaut3 );
            System.out.println("Third highest score: " + astronaut2 );
        }
            
        if (score2 > score1 && score1 > score3){
            System.out.println("Highest score: " + astronaut2 );
            System.out.println("Second highest score: " + astronaut1 );
            System.out.println("Third highest score: " + astronaut3 );
        }
        if (score2 > score3 && score3 > score1){
            System.out.println("Highest score: " + astronaut2 );
            System.out.println("Second highest score: " + astronaut3 );
            System.out.println("Third highest score: " + astronaut1 );
        }
        if (score3 > score2 && score2 > score1){
            System.out.println("Highest score: " + astronaut3 );
            System.out.println("Second highest score: " + astronaut2 );
            System.out.println("Third highest score: " + astronaut1 );
        }
        if (score3 > score1 && score1 > score2){
            System.out.println("Highest score: " + astronaut3 );
            System.out.println("Second highest score: " + astronaut1 );
            System.out.println("Third highest score: " + astronaut2 );
        }

        
        // Determine the second place astronaut.

        // Determine the third place astronaut.

        // Display the results.
        

    }
}
