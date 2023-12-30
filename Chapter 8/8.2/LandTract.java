// Create a class named LandTract
class LandTract{
    // Create doubles for length and width
    private double length;
    private double width;
    // Create a constructor named LandTract that accepts length and width
        // Set length to the input length
        // Set width to the input width
    public LandTract (double l, double w)
    {
        length = l;
        width = w;
    }
    // Create a method named getArea that returns a double
        // Return length * width
    public double getArea()
    {
        return length * width;
    }
    // Create a method named equals that accepts a LandTract object and returns a bool
        // Create a status bool
        // Compare tact2's length and width against tract1's length and width using this
        // If true, set status to true
        // If false, set status to false
        // Return the status
    public boolean equals ( LandTract tract2)
    {
        boolean status = false;
        
        if (this.length == tract2.length && this.width == tract2.width)
        {
            status = true;
        }
        else
        {
            status = false;
        }
        return status;
    }
    // Freebie
    public String toString()
    {
        String str = String.format("Length = %,.2f\n" +
                        "Width = %,.2f\n" +
                        "Area = %,.2f\n",
                length, width, getArea());
        return str;
    }
}
