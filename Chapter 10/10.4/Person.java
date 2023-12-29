// Create a class named Person
class Person
{
    // Create strings for name, address, and phone number
    private String name , address , phoneNumber ;

    // Create a no-arg constructor
    public Person()
    {
        // Set name, address, and phone to empty strings.
        name = "";
        address = "";
        phoneNumber = "";
    }
    // Create a constructor that accepts strings for name, address, and phone number
    public Person(String n, String a, String pn)
    {
        // Set name, address, and phone number to the user's inputs
        name = n;
        address = a;
        phoneNumber = pn;
    }
    // Create a void method named setName that accepts a string
    public void setName(String s)
    {
        // Set name to the user's input
        name = s;
    }
    // Create a void method named setAddress that accepts a string
    public void setAddress(String s)
    {
        // Set address to the user's input
        address = s;
    }
    // Create a void method named setPhone that accepts a string
    public void setPhone(String s)
    {
        // Set phone to the user's input
        phoneNumber = s;
    }
    // Create a method named getName that returns a string
    public String getName()
    {
        // Return the user's input for name
        return name;
    }
    // Create a method named getAddress that returns a string
    public String getAddress()
    {
        // Return the user's input for address
        return address;
    }
    // Create a method named getPhone that returns a string
    public String getPhone()
    {
        // Return the user's input for phone
        return phoneNumber;
    }
}