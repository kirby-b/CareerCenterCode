import java.util.Scanner;

public class Main {

    /* ======================================
    ===== Challenge 7-2 - Payroll Class =====
    =========================================

    Write a Payroll class that uses the following arrays as fields:

        - employeeID. An array of seven integers to hold employee identification numbers.
          The array should be initialized with the following numbers:
          5658845  4520125  7895122  8777541  8451277  1302850  7580489
        - hours. An array of seven integers to hold the number of hours worked by each
          employee.
        - payRate. An array of seven doubles to hold each employee's hourly pay rate.
        - wages. An array of seven doubles to hold each employee's gross wage.

    The class should relate the data in each array through the subscripts. For example, the
    number in element 0 of the hours array should be the number of hours worked by the employee
    whose identification number is stored in element 0 of the employeeId array. That same
    employee's pay rate should be stored in element 0 of the payRate array.

    In addition to the appropriate accessor and mutator methods, the class should have a method
    that accepts an employee's identification number as an argument and returns the gross pay
    for that employee.

    Demonstrate the class in a complete program that displays each employee number and asks
    the user to enter that employee's hours and pay rate. It should then display each employee's
    identification number and gross wages.

    *Input Validation: Do not accept negative values for hours or numbers less than 6.00 for pay rate.*

     */

    public static void main(String[] args) {
        // Hours worked
        int worked = 0;
        // Hourly pay rate
        double payRate = 0;
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        // Create a Payroll object.
        Payroll payMe = new Payroll();
        // Get the hours and pay rate for each employee.
          for (int i = 0; i < 7; i++)
            {
              System.out.print("Enter the hours worked by employee number "+ payMe.getEmployeeIdAt(i) +": ");
              worked = keyboard.nextInt();
              while (worked < 0)
                {
                  System.out.print("ERROR: Enter 0 or greater for hours: ");
                  worked = keyboard.nextInt();
                }
              payMe.setHoursAt(i, worked);
              System.out.print("Enter the hourly pay rate for employee number "+ payMe.getEmployeeIdAt(i) +": ");
              payRate = keyboard.nextDouble();
              while (payRate < 6)
                {
                  System.out.print("ERROR: Enter 6.00 or greater for pay rate: "); 
                  payRate = keyboard.nextDouble();
                }
                payMe.setPayRateAt(i, payRate);
            }
            keyboard.close();
            // Get the hours worked.

            // Validate hours worked.

            // Get the hourly pay rate.

            // Validate pay rate.

            // Store the data in the pr object.

        // Display the payroll data for each employee.
        System.out.println("\nPAYROLL DATA\n============");
        for (int i = 0; i < 7; i++)
        {
          System.out.printf("Employee ID: "+payMe.getEmployeeIdAt(i)+"\nGross pay: $%,.2f\n", payMe.getGrossPay(i));
        }
    }
}
