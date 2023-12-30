// Crete a class named Month
class Month{
    // Create an int named monthNumber
    private int monthNumber;

    
    String [] validMonthsStrings = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    // Create a no-arg constructor for Month
        // Set monthNumber to 1
    public Month()
    {
        monthNumber = 1;
    }
    // Create a constructor for Month that accepts an int
        // Validate the input (if larger than 12 or smaller than 1)
            // Set monthNumber to 1
        // If it's valid, set month number to whatever month it is
    public Month(int m)
    {
        if (m < 1 || m > 12)
        {
            m = 1;
        }
        monthNumber = m;
    }
    // Create a constructor for Month that accepts a string
        // Set a series of else-if statements that ignore case for the input
        // If "january" monthNumber is 1
        // If "february" monthNumber is 2
        // Continue the pattern
        // If something else, monthNumber defaults to 1
    public Month(String m)
    {
        
        int mn = 1;
        for ( int i = 0; i < validMonthsStrings.length; i++)
        {
            if (m.equalsIgnoreCase(validMonthsStrings[i]))
                {
                    mn = i + 1;
                }
        }
        monthNumber = mn;
    }

    // Create a void method named setMonthNumber that accepts an int.
        // If the number is smaller than 1 or larger than 12
        // Set monthNumber to 1
        // Otherwise set monthNumber to the input
    public void setMonthNumber(int m)
    {
        if (m < 1 || m > 12)
        {
            m = 1;
        }
        monthNumber = m;
    }
    // Create an int returning method named getMonthNumber
        // Return the monthNumber
    public int getMonthNumber()
    {
        return monthNumber;
    }
    // Create a string returning method named getMonthName
        // Create a string to hold the name of the month
        // Use a switch statement that checks monthNumber
            // Case 1, set to "January"
            // Case 2, set to "February"
            // Continue the pattern
            // Set the default to "Unknown"
        // Return the value for name
    public String getMonthName()
    {   
        String monthName = "Unknown";
        
        for ( int i = 0; i < validMonthsStrings.length; i++)
        {
            if ((i + 1) == monthNumber)
            {
                monthName = validMonthsStrings[i];
                break;
            }
        }
        
        return monthName;
    }
    // Create a string returning method named toString
        // Return the value from getMonthName
    public String toString()
    {
        String str = ("");
        return str;
    }
    // Create a boolean returning method named equals that accepts a month object
        // Create a bool for status
        // If monthNumber for month 1 is the same as monthNumber for month 2
            // Set status to true
        // Otherwise
            // Set status to false
        // Return the status
    public boolean equals (Month m)
    {
        boolean status = false;
        if (this.monthNumber == m.monthNumber)
        {
            status = true;
        }
        return status;
    }
}