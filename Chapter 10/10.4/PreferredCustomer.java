// Create a class named PreferredCustomer that extends Customer
class PreferredCustomer extends Customer
{
    // Create doubles for purchase and discount level
    private double purchases, discountLevel;
    // Create a no-arg constructor for PreferredCustomer
    public PreferredCustomer()
    {
        // Run the super method
        super();
        // Set purchases to 0.0
        purchases = 0;
        // Set discountLevel to 0.0
        discountLevel = 0;
    }
    // Create a constructor that accepts the following arguments:
    // Name, address, phone, customer number, mailing list, and amount purchased
    public PreferredCustomer (String name, String address, String phone, String customerNum, boolean mailing, Double amountPurchased)
    {
        // Run the super method passing the following:
        // Name, address, phone, customer number, and amount purchased
        super(name, address, phone, customerNum, mailing);

        // Call the setPurchase method passing the amount purchased value
        setPurchases(amountPurchased);

    }
    // Create a void method named setPurchases that accepts a double
    public void setPurchases(double d)
    {
        // Set purchases to the value passed
        purchases = d;
        // Determine the discount using the following values/table
            // >=$2000 = 10% Discount
            // >=$1500 = 07% Discount
            // >=$1000 = 06% Discount
            // >=$ 500 = 05% Discount
            // Else    = 00% Discount
            if (purchases >= 2000)
            {discountLevel = 0.10;}
            else if (purchases >= 1500)
            {discountLevel = 0.07;}
            else if (purchases >= 1000)
            {discountLevel = 0.06;}
            else if (purchases >= 500)
            {discountLevel = 0.05;}
            else 
            {discountLevel = 0.00;}
    }
    // Create a double returning method named getPurchases
    public double getPurchases()
    {
        // Return the value for purchases
        return purchases;
    }
    // Create a double returning method named getDiscountLevel
    public double getDiscountLevel()
    {
        // Return the value for discountLevel
        return discountLevel;
    }
}