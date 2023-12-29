
// Create a class named Customer that extend the Person class
class Customer extends Person
{
    // Create a string for customerNumber and a bool for mailingList
    String customerNumber;
    boolean mailingList;
    // Create a no-arg constructor for customer
    public Customer()
    {
        // Call the super method
        super();
        // Set customerNumber to an empty string
        customerNumber = "";
        // Set mailingList to false
        mailingList = false;
    }
    // Create a constructor for Customer that accepts name, address, phone,
    // customer number, and whether or not they're on the mailing list
    public Customer(String name, String address, String phone, String customerNum, Boolean mailing)
    {
        // Call the super method passing through the name, address, and phone number
        super(name, address, phone);
        // Set customerNumber to the input value
        customerNumber = customerNum;
        // Set mailing list to the value for mailing list
        mailingList = mailing;
    }
    // Create a void method named setCustomerNumber that accepts a string
    public void setCustomerNumber(String num)
    {
        // Set CustomerNumber to the user's input value
        customerNumber = num;
    }
    // Create a void method named setMailingList that accepts a bool
    public void setCustomerNumber(Boolean mail)
    {
        // Set mailingList to the value for mailing list
        mailingList = mail;
    }
    // Create a string returning method named getCustomerNumber
    public String getCustomerNumber()
    {
        // Return the customer number
        return customerNumber;
    }
    // Create a bool returning class named getMailingList
    public boolean getMailingList()
    {
        // Return the value for mailingList
        return mailingList;
    }
}