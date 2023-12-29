
    // THIS CLASS IS CORRECT AND COMPLETE. DO NOT MODIFY.

public class ProductionWorker extends Employee
{
    // Constants for the day and night shifts.
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;

    private int shift;         // The employee's shift
    private double payRate;    // The employee's pay rate

    public ProductionWorker(String n, String num, String date,
                            int sh, double rate)
    {
        super(n, num, date);
        shift = sh;
        payRate = rate;
    }

    public ProductionWorker()
    {
        super();
        shift = DAY_SHIFT;
        payRate = 0.0;
    }

    public void setShift(int s)
    {
        shift = s;
    }

    public void setPayRate(double p)
    {
        payRate = p;
    }

    public int getShift()
    {
        return shift;
    }

    public double getPayRate()
    {
        return payRate;
    }

    @Override
    public String toString()
    {
        String str = super.toString();

        str += "\nShift: ";
        if (shift == DAY_SHIFT)
            str += "Day";
        else if (shift == NIGHT_SHIFT)
            str += "Night";
        else
            str += "INVALID SHIFT NUMBER";

        str += String.format("\nHourly Pay Rate: $%,.2f", payRate);

        return str;
    }
}

