import java.io.*;
import java.util.Scanner;

public class Main {

    /* =========================================
    ===== Challenge 11-6 - FileArray Class =====
    ============================================

    Design a class that has a static method named writeArray. The method should take two
    arguments: the name of a file and a reference to an int array. The file should be opened as
    a binary file, the contents of the array should be written to the file, and then the file
    should be closed.

    Write a second method in the class name readArray. The method should take two arguments:
    the name of a file and a reference to an int array. The file should be opened, data should
    be read from the file and stored in the array, and then the file should be closed.
    Demonstrate both methods ina program.

    THIS FILE IS COMPLETE AND CORRECT. DO NOT MODIFY.
    */
    public static void main(String[] args) {

        int[] numbers = new int[8];
        int[] test = new int[8];
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter eight numbers pressing 'Enter' between each.");
        for(int n=0; n < 8; n++) {
            numbers[n] = keyboard.nextInt();
        }
        try
        {
            // Write the array to the file MyLetters.txt.
            FileArray.writeArray("MyNumbers.txt", numbers);

            // Read the contents of the file into the test array.
            FileArray.readArray("MyNumbers.txt", test);

            // Display the characters.
            System.out.println("The numbers read from the file are:");
            for (int i = 0; i < test.length; i++)
                System.out.print(test[i] + " ");
        }
        catch (IOException e)
        {
            System.out.println("Error = " + e.getMessage());
        }
    }
}
