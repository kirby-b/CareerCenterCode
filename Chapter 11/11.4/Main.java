import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of the file you want encrypted");
        input = keyboard.nextLine();
        System.out.println("Encrypting the contents of the file");
        System.out.println("MyLetters.txt. The encrypted file will");
        System.out.println("be stored as Encrypted.txt");

        // Use a try catch block
        try
        {
            //Use the Crypto class to get the input from the user and export to Encrypted.txt
            Crypto c = new Crypto();
            c.encryptFile(input, "Encrypted.txt");
            //Tell the user, "Done. Use Notepad to inspect the encrypted file."
            System.out.println("Done. Use Notepad to inspect the encrypted file.");
        }
        catch (IOException e)
        {
            // If there's an error
            // Tell the user "Error - (error message)"
            System.out.println("Error");
        }
}
}
// CONGRATULATIONS THIS IS THE LAST CHALLENGE.
// THERE ARE OTHER THINGS YOU CAN DO, BUT THIS IS THE END OF THE STANDARD JAVA COURSE.S