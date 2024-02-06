import java.util.*;

import java.io.*;

public class Main
{
    /* =============================================
    ===== Challenge 7-10 - Average Steps Taken =====
    ================================================

    A Personal Fitness Tracker is a wearable device that tracks your physical activity, calories
    burned, heart rate, sleeping patterns, etc. One common physical activity that most of these
    devices track is the number of steps you take each day.

    Along with the starter code provided, there is a file named steps.txt. This file contains a
    number of steps a person has taken each day for a year. There are 365 lines in the file,
    and each line contains the number of steps taken during the day. (The first line is the
    number or steps taken on January 1, the second line is the number of steps taken on
    January 2, and so forth.) Write a program that reads the file, and then displays the
    average number of steps taken for each month.

    *Note: The data is not from a year that was not a leap year, so February has 28 days.*

     */
    // Named constants for the months- value is numbe rof days?
    
    // Named constants for the days in the months

    // Array of the month names
    
    // Array of the days of the months
    
    public static void main(String[] args) throws IOException
    {
        String[] months = {"January" , "February" , "March" , "April", "May" , "June" , "July" , "August" , "September" , "October", "November", "December"};
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        String numberString ="";
        int numberInt = 0, passed = 0, daysinMonth = 0, pos = 0;
        // Array to hold the steps
        int[] steps = new int[365];
        // Open the file - use filereader to get it
        File choosenFile = new File("steps.txt");
        Scanner inputFile = new Scanner(choosenFile);

        
        // Read the file's contents into the Array
        
        while(inputFile.hasNextLine())
        {
            numberString = inputFile.nextLine();
            numberInt = Integer.parseInt(numberString);
            
            steps[pos] = numberInt;
            pos++;
        }
        
        // Close the file
        inputFile.close();
        // Display the average steps for each month
        /*
        For 12 months
         variable: number of days in the month
         variable: current month to compare to constants and stuff
         variable: days passed: each month added up until done

            for number of days in averagesteps method instead 
            make it start at the month and its first day
        */
        for (int i = 0; i < 12; i++)
        {
            daysinMonth = days[i];
            System.out.printf("Average steps for "+months[i]+": %.2f\n" , averageSteps(steps, passed, daysinMonth));
            passed = passed + daysinMonth;
        }
        
    // Returns the average number of steps for the given month
        
        // Calculate the starting position in the Array

        // Go to the beginning of the specified month

        // Calculate the average of the steps

        // Return the average
    }
    public static double averageSteps (int[] steps, int passed, int days)
    {
        double avg = 0; 
        
        for (int i = 0; i < days; i++)
        {
            avg = avg + steps[i + passed];
        }
        avg = avg/days;
        return avg;
    }
}
