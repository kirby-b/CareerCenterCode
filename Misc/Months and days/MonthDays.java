public class MonthDays
{
    // Fields
    private String month = "";
    private int year = 0;
    // The year

    /**
     The constructor accepts two integer values,
     the month and year, as arguments.
     @param m The month.
     @param y The year.
     */
    public void setMonth(int m, int y)
    {
        if (m == 1)
            month = "January";
        if (m == 2)
            month = "February";
        if (m == 3)
            month = "March";
        if (m == 4)
            month = "April";
        if (m == 5)
            month = "May";
        if (m == 6)
            month = "June";
        if (m == 7)
            month = "July";
        if (m == 8)
            month = "August";
        if (m == 9)
            month = "September";
        if (m == 10)
            month = "October";
        if (m == 11)
            month = "November";
        if (m == 12)
            month = "December";

        year = y;

    }
    /**
     The numberOfDays method returns the number
     of days in the specified month.
     @return The number of days in the month.
     */

        // Local variable for the number of days,
        // initialized to 31.

        // Determine the number of days in the month.
                // January has 31 days.

                // Determine if the year is a leap year.
                    // If so, February has 29 days.
                    // If not, February has 28 days.
                // March has 31 days.
                // April has 30 days.
                // May has 31 days.
                // June has 30 days.
                // July has 31 days.
                // August has 31 days.
                // September has 30 days.
                // October has 31 days.
                // November has 30 days.
                // Decemeber has 31 days.

        // Return the number of days.
    public int getInfo()
    {
        int days = 31;

        if (month == "January")
            days = 31;
        if (month == "February")
            if (year%100 == 0 && year%400 == 0)
                days = 29;
            if (year%100 != 1 && year%4 == 0)
                days = 29;
            else 
                days = 28;
        if (month == "March")
            days = 31;
        if (month == "April")
            days = 30;
        if (month == "May")
            days = 31;
        if (month == "June")
            days = 30;
        if (month == "July")
            days = 31;
        if (month == "August")
            days = 31;
        if (month == "September")
            days = 30;
        if (month == "October")
            days = 31;
        if (month == "November")
            days = 30;
        if (month == "December")
            days = 31;

        return days;
    }
    }

