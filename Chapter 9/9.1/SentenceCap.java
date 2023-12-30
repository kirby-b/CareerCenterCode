import java.util.Scanner;

public class Main {

        /* =============================================
        ===== Challenge 9.1 - Sentence Capitalizer =====
        ================================================

        Write a method that accepts a String object as an argument and returns a copy of the string
        with the first character of each sentence capitalized. For instance, if the argument is "hello, my
        name is Joe. what is your name?" the method should return the string "Hello. My name is Joe.
        What is your name?" Demonstrate the method in a program that asks the user to input a string
        and then passes it to the method. The modified string should be displayed on the screen.

         */
    public static void main(String[] args) {
        // Create a scanner and a string to hold the input
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        // Ask the user to "Enter a string."
        System.out.println("Enter a string.");
        // Get their input.
        input = keyboard.nextLine();
        // Print the input using the sentenceCap method that passes the input
        System.out.println(sentenceCap(input));
        //Close the program.
        System.exit(0);
    }
    
    // Create a method that accepts and returns a string named sentenceCap
        // Create a counter int
        // Create a StringBuffer to hold the string and initialize it with the input
        // Capitalize the first letter of the input

        // Loop through each character looking for a period
            // Once a period is found, find the next letter and capitalize it

        // Return the corrected string of the user's input
        public static String sentenceCap (String s)
        {
            int counter = 0;
            boolean capitalize = true;
            s = s.trim();
            StringBuilder string = new StringBuilder(s);
            string.setCharAt(0, Character.toUpperCase(s.charAt(0)));
    
            
            while (counter< string.length())
            {
                if (string.charAt(counter) == '.')
                {
                    capitalize = true;
                }
                else if (capitalize && !Character.isWhitespace(string.charAt(counter))){
                    string.setCharAt(counter, Character.toUpperCase(string.charAt(counter)));
                    capitalize = false;
                }
                counter++;
           }
             
            return string.toString();
        }
}