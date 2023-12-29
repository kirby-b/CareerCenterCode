// Create a class named Employee
class Employee
{
    // Create strings for name, employeeNumber, and hireDate
    String name = "", employeeNumber = "", hireDate = "";
    // Create a constructor that accepts name, employee number, and hire date
        
    public Employee (String n, String employeeNum, String hireD)
    {
        // Set name to the input for name
        name = n;
        // Call the setEmployeeNumber passing the employee number to it
        setEmployeeNumber(employeeNum);
        // Set hire date to the input for hire date
        hireDate = hireD;
    }

    // Create a no-arg constructor for employee
    public Employee()
    {
        // Set name, employee number, and hire date all to empty strings
        name = "";
        employeeNumber = "";
        hireDate = "";
    }
    // Create a void method named setName that accepts a string
    public void setName(String n)
    {
        // Set name to the input value for name
        name = n;
    }
    // Create a void method named setEmployeeNumber that accepts a string
    public void setEmployeeNumber(String n)
    {
        // Check to see if the input is valid using the isValidEmpNum method
        boolean bool = isValidEmpNum(n);
        // If it is, set employeeNumber to the input
        if (bool == true)
        {
            employeeNumber = n;
        }
        // Otherwise, set employee number to an empty string
        else
        {
            employeeNumber = "";
        }
    }
    // Create a method named setHireDate that accepts a string
    public void setHireDate(String d)
    {
        // Set hireDate to the input
        hireDate = d;
    }
    // Create a string returning method named getName that returns the value for name
    public String getName()
    {
        return name;
    }
    // Create a string returning method named getEmployeeNumber that returns the value for employee number
    public String getEmployeeNumber()
    {
        return employeeNumber;
    }
    // Create a string returning method named getHireDate that returns a hire date
    public String getHireDate()
    {
        return hireDate;
    }

    // Create a bool returning method named isValidEmpNum that accepts a string
    public boolean isValidEmpNum(String s)
    {
        // Create a bool for status and set it to false
        boolean status = true;
        // Verify the following things. If any of them are not true, set status to false.
        if (s.length() != 5)
        {// The length should be exactly 5 characters
            status = false;
            
        }
        if (!Character.isDigit(s.charAt(0)) || !Character.isDigit(s.charAt(1))  || !Character.isDigit(s.charAt(2)))
        {// The first 3 characters should be digits
            status = false;
            
        }
        if (s.charAt(3) != '-')
        {// The next character should be a dash
            status = false;
            
        }
        if (!Character.isLetter(s.charAt(s.length() - 1)))
        {// The last character should be a letter
            status = false;
            
        }
        // Return the value for status
        return status;
    }
    // This is the toString method referenced in the TeamLeader class.
    // This method is complete and correct. Do not modify.
    public String toString()
    {
        String str = "Name: " + name + "\nEmployee Number: ";

        if (employeeNumber == "")
            str += "INVALID EMPLOYEE NUMBER";
        else
            str += employeeNumber;

        str += ("\nHire Date: " + hireDate);
        return str;
    }
}

