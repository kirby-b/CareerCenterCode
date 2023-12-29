import java.io.*;

// Create a class named FileArray
class FileArray
{
    // Create a void method named writeArray that accepts the filename and the array.
    public static void writeArray(String fileName,int[] array )
                                            throws IOException
    {
        // This method should throw an IOException
    
    // Create a FileOutputStream and a DataOutputStream
        FileOutputStream file = new FileOutputStream(fileName);
        DataOutputStream outputFile = new DataOutputStream(file);
    // Use a loop to write the array to the file
    for(int i = 0; i < array.length; i++)
    {
        outputFile.writeInt(array[i]);
    }
    // Close the file
        outputFile.close();
    }
    // Create a void array named readArray that accepts the filename and the array.
    public static void readArray(String fileName,int[] array )
                                            throws IOException
    {
        // This method should throw an IOException
        int number = 0;
    // Create a FileInputStream and a DataInputStream
        FileInputStream file = new FileInputStream(fileName);
        DataInputStream inputFile = new DataInputStream(file);
    // Use a loop to read the file into the array
    for(int i = 0; i < array.length; i++)
    {
        number = inputFile.readInt();
        array[i] = number;
    }
    // Close the file
        inputFile.close();
    }
}