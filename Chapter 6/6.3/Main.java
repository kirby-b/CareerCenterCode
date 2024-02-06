import java.util.Scanner;

public class Main {

    /* ========================================
    ===== Challenge 6-9 - Days in a Month =====
    ===========================================

    Write a class named MonthDays. The class's constructor should accept two arguments:
        - An integer for the month (1 = January, 2 February, etc.)
        - An integer for the year

    The class should have a method named numberOfDays that returns the number of days in
    the specified month. The method should use the following criteria to identify leap years:
        1. Determine whether the year is divisible by 100. If it is, then it is a leap year and
           if only it is divisible by 400. For example, 2000 is a leap year but 2100 is not.
        2. If the year is not divisible by 100, then it is a leap year if and only if it is divisible
           by 4. For example, 2008 is a leap year but 2009 is not.

    Demonstrate the class in a program that asks the user to enter the month (letting the user
    enter an integer in the range of 1 through 12) and the year. The program should then display
    the number of days in that month. Here is a sample run of the program:

        Enter a month (1-12): 2 [Enter]
        Enter a year: 2008 [Enter]
        29 Days

     */
    public static void main(String[] args) {
        // To hold the month
        // To hold the year
        int month = 0;
        int year = 0;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Get the month.
        System.out.print("Enter a month (1-12): ");
        month = keyboard.nextInt();
        // Get the year.
        System.out.print("Enter a year: ");
        year = keyboard.nextInt();
        keyboard.close();
        // Create an instance of the MonthDays class.
        MonthDays info = new MonthDays();
        info.setMonth(month, year);
        // Display the number of days.
        System.out.print(info.getInfo() + " days");
    }
}
