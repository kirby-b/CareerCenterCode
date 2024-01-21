public class Circle
{
    private double Pi =  3.14159;
    private double circumference;
    private double area;
    private double diameter;
    private double radius = 0 ;
    /**
     This constructor initializes the object with
     a radius of 0.0.
     */

    /**
     The constructor initializes the object with
     a specified radius.
     @param r The circle's radius.
     */
    public void setRadius(double r)
    {
       radius = r;
    }
    /**
     The setRadius method sets the circle's radius.
     @param r The radius.
     */
    public double getRadius()
    {
       return radius;
    }
    /**
     The getRadius method returns the circle's radius.
     @return The radius.
     */
    public double area()
    {
       area = Pi * radius * radius;
       return area;
    }
    /**
     The area method returns the circle's area.
     @return The area of the circle.
     */
    public double diameter()
    {
       diameter = radius * 2;
       return diameter;
    }
    /**
     The diameter method returns the circle's diameter.
     @return The diamter of the circle.
     */
    public double circumference()
    {
       circumference = 2 * Pi * radius;
       return circumference;
    }
    /**
     The circumference method returns the
     circle's circumference.
     @return The circumference of the circle.
     */

}
