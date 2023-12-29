import java.io.*;

// Create a class named Crypto
class Crypto 
{
    
    // Create a void method named encryptFile that accepts a string for the input and
    // a string for the output file name and throws an IOException
    public void encryptFile(String inputF, String outputF) throws IOException
    {
        // Create a bool for end of file and set it to false
        boolean end = false;
        
        // Create a FileInputStream that accepts the filename that the user entered
        FileInputStream input = new FileInputStream(inputF);
        // Create a DataInputStream that accepts the FileInputStream
        DataInputStream dsi = new DataInputStream(input);
        // Create a FileOutputStream that accepts the encrypted.txt filename
        FileOutputStream output = new FileOutputStream(outputF);
        // Create a DataOutputStream that accepts the FileOutputStream
        DataOutputStream dso = new DataOutputStream(output);
        // Use a loop to check to see if not the end of file to process it
        while (end = false)
        {
            // try
                // Create a byte that reads the input
                // Encrypt the byte by adding 10 to it
                // Output the byte that was encrypted
            try
            {
                byte b =  dsi.readByte();
                b += 10;
                dso.writeByte(b);
            }
            // Catch an error
                // set end of file to true
            catch (EOFException e)
            {
                end = true;
            }
            // Close both files
            finally
            {
                output.close();
                input.close();
            }
        }   
    }
}