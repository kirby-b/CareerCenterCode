// Create a class named TeamLeader that extends ProductionWorker
class TeamLeader extends ProductionWorker
{


    // Create doubles for monthlyBonus, requiredTrainingHours, and trainingHoursAttended
    double monthlyBonus = 0, requiredTrainingHours = 0, trainingHoursAttended = 0;
    // Create a constructor that accepts the employee's name, employee number, hire date, shift, pay rate,
    // monthly bonus, and number of training hours attended.
    public TeamLeader(String name, String employeeNum, String hireDate, int shift, double payRate, double monBonus, double requiredtHours, double tHoursAttended)
    {
        // Name, employee number, hire date, shift, and pay rate should be handled by the superclass
        super(name, employeeNum, hireDate, shift, payRate);
        // Set monthlyBonus to the input value
        monthlyBonus = monBonus;
        // Set requiredTrainingHours to the input value
        requiredTrainingHours = requiredtHours;
        // Set trainingHoursAttended to the input value
        trainingHoursAttended = tHoursAttended;
    }
    // Create a no-arg constructor for TeamLeader
    public TeamLeader()
    {
        // Call the super method
        super();
        // Set monthlyBonus to 0.0
        setMonthlyBonus(0.0);
        // Set requiredTrainingHours to 0.0
        setRequiredTrainingHours(0.0);
        // Set trainingHoursAttended to 0.0
        setTrainingHoursAttended(0.0);
    }
    // Create a void method named setMonthlyBonus that accepts a double
    public void setMonthlyBonus (double d)
    {
        // Set monthlyBonus to the input value
        monthlyBonus = d;
    }
    // Create a void method named setRequired training hours that accepts a double
    public void setRequiredTrainingHours (double d)
    {
        // Set requiredTrainingHours to the input value
        requiredTrainingHours = d;
    }
    // Create a void method named setTrainingHoursAttended that accepts a double
    public void setTrainingHoursAttended (double d)
    {
        // Set trainingHoursAttended to the input value
        trainingHoursAttended = d;
    }
    // Create double returning method named getMonthlyBonus
    public double getMonthlyBonus()
    {
        // Return the value for monthlyBonus
        return monthlyBonus;
    }
    // Create a double returning method named getRequiredTrainingHours
    public double getRequiredTrainingHours()
    {
        // Return the value of requiredTrainingHours
        return requiredTrainingHours;
    }
    // Create a double returning method named getTrainingHoursAttended
    public double getTrainingHoursAttended()
    {
        // Return the value of trainingHoursAttended
        return trainingHoursAttended;
    }
    // I didn't teach this, so it's free.
    @Override

    // Create a string returning method named toString
    public String toString()
    {
        // Create a string and set it to the value from the superclass set to a string
        String str = super.toString();
        // Set string to string plus the following:
        // "\nMonthly Bonus: $(monthlyBonus)"
        str = str + String.format("\nMonthly Bonus: $%,.2f", monthlyBonus);
        // Set string to string plus the following:
        // "\nRequired Training Hours: (requiredTrainingHours)"
        str = str + String.format("\nRequired Training Hours: %,.1f", requiredTrainingHours);
        // Set string to string plus the following:
        // "\nTraining Hours Attended: (trainingHoursAttended)"
        str = str + String.format("\nTraining Hours Attended: %,.1f", trainingHoursAttended);
        // Return the string
        return str;
    }
}