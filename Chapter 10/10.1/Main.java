import java.util.Scanner;

public class Main {

    /* ==========================================
    ===== Challenge 10.1 - TeamLeader Class =====
    =============================================

    In a particular factory, a team leader is an hourly paid production worker that leads a small
    team. In addition to hourly pay, team leaders earn a fixed monthly bonus. Team leaders are
    required to attend a minimum number of hours of training per year. Design a TeamLeader
    class that extends the ProductionWorker class included with the starter code for this challenge.
    The TeamLeader class should have fields for the monthly bonus amount, the required number
    of training hours, and the number of training hours that the team leader has attended.
    Write one or more constructors and the appropriate accessor and the mutator methods for the
    class. Demonstrate the class by writing a program that uses the TeamLeader object.

    THIS CLASS IS COMPLETE AND CORRECT. DO NOT MODIFY.
     */

    public static void main(String[] args) {
        // Create a TeamLeader object and pass the initialization
        // data to the constructor.

        // Create variables and scanner
        Double payRate;
        Double monthlyBonus;
        String employeeNumber;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the employee number");
        employeeNumber = keyboard.nextLine();

        System.out.println("Enter the employee's pay rate");
        payRate = keyboard.nextDouble();

        System.out.println("Enter the employee's bonus");
        monthlyBonus = keyboard.nextDouble();


        TeamLeader t =
                new TeamLeader("John Smith", employeeNumber, "11-15-2005",
                        ProductionWorker.DAY_SHIFT, payRate, monthlyBonus,
                        5.0, 2.5);

        // Display the data.
        System.out.println("Here's the first team leader.");
        System.out.println(t);

        // Create another TeamLeader object and use the
        // set methods.
        TeamLeader t2 = new TeamLeader();
        t2.setName("Joan Jones");
        t2.setEmployeeNumber(employeeNumber);
        t2.setHireDate("12-12-2005");
        t2.setShift(ProductionWorker.NIGHT_SHIFT);
        t2.setPayRate(payRate);
        t2.setMonthlyBonus(monthlyBonus);
        t2.setRequiredTrainingHours(7.0);
        t2.setTrainingHoursAttended(3.5);

        // Display the data.
        System.out.println("\nHere's the second production worker.");
        System.out.println(t2);
    }
}
