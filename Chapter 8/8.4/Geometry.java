// Create a class named Geometry
class Geometry{
    
    // Create a static class named circleArea that returns a double and accepts a double
        // Return pi * r * r
    public static double circleArea(double r)
    {
        return Math.PI * r * r;
    }
    // Create a static class named rectangleArea that returns a double and accepts two doubles
        // Return length times width
    public static double rectangleArea(double l, double w)
    {
        return l * w;
    }
    // Create a static class named triangleArea that returns a double and accepts two doubles
        // Return base * height * 0.5
    public static double triangleArea(double b, double h)
    {
        return b * h * 0.5;
    }

}