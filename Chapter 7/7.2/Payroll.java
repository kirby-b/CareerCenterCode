/**
 The Payroll class stores data about a payroll
 for the Payroll Class programming challenge.
 */
public class Payroll
{
    // Number of employees
    // Employee ID numbers
    int[]idNums = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    // Array to hold hours worked
    int[]hours = {0,0,0,0,0,0,0};
    // Array to hold pay rates
    double[]payRates = {0,0,0,0,0,0,0};
    // Array to hold gross wages
    double[]wages = {0,0,0,0,0,0,0};
    /**
     The getGrossPay method returns the gross pay
     for the employee whose data is stored at a
     specified element of each array.
     @param i The specified element.
     @return The value stored at the specified element.
     */
    public double getGrossPay(int i)
    {
        double grossPay = 0;
        grossPay = payRates[i] * hours[i];
        return grossPay;
    }

    /**
     The setEmployeeIdAt method stores an ID number
     at a specified element of the employeeId array.
     @param i The specified element.
     @param id The ID number to store.
     */
    public void setEmployeeIdAt(int i, int id)
    {
        idNums[i] = id;
    }
    /**
     The setHoursAt method stores a number of hours
     at a specified element of the hours array.
     @param i The specified element.
     @param h The ID number of hours to store.
     */
    public void setHoursAt(int i, int h)
    {
        hours[i] = h;
    }
    /**
     The setPayRateAt method stores a pay rate
     at a specified element of the payRate array.
     @param i The specified element.
     @param p The pay rate to store.
     */
    public void setPayRateAt(int i, double p)
    {
        payRates[i] = p;
    }
    /**
     The setWages method stores an amount of wages
     at a specified element of the wages array.
     @param i The specified element.
     @param w The wages to store.
     */
    public void setWagesAt(int i, int w)
    {
        wages[i] = w;
    }
    /**
     The getEmployeeIdAt method returns the ID number
     at a specified element of the employeeId array.
     @param i The specified element.
     @param id The ID number found at element i.
     */
    public int getEmployeeIdAt(int i)
    {
        int id = 0;
        id = idNums[i];
        return id;
    }
    /**
     The getHoursAt method returns the hours found
     at a specified element of the hours array.
     @param i The specified element.
     @param id The hours found at element i.
     */
    public int getHoursAt(int i)
    {
        int h = 0;
        h = hours[i];
        return h;
    }
    /**
     The getPayRateAt method returns the pay rate
     found at a specified element of the payRate array.
     @param i The specified element.
     @param id The pay rate found at element i.
     */
    public double getPayRatesAt(int i)
    {
        double p = 0;
        p = payRates[i];
        return p;
    }
    /**
     The getWages method returns the wages found
     at a specified element of the wages array.
     @param i The specified element.
     @param id The wages found at element i.
     */
    public double getWagesAt(int i)
    {
        double w = 0;
        w = wages[i];
        return w;
    }
}

