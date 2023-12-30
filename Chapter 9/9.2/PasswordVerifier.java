// Create a class named PasswordVerifier
class PasswordVerifier
{
    // Create a final int named MIN_PASSWORD_LENGTH and set it to 6
    int MIN_PASSWORD_LENGTH = 6;
    // Create a bool method named isValid that accepts the string
    public boolean isValid (String s)
    {
        // Create a bool for status
        boolean bool = false;
        // Make sure the string is long enough and has the right characters using methods
        if (s.length() >= MIN_PASSWORD_LENGTH && hasDigit(s) && hasLowerCase(s) && hasUpperCase(s))
        {
            bool = true;
        }
        // If it is, set status to true
        // Otherwise, set status to false
        // Return the status
        return bool;
    }
    // Create a bool method named hasUpperCase that accepts the string
        // Create a bool for status and set it to false
    public boolean hasUpperCase(String s)
    {
        boolean bool = false;
        // Check to see if any character in the string is uppercase
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isUpperCase(s.charAt(i)))
            {
                bool = true;
            }
        }
        // If it is, set status to true
        // Otherwise, set status to false
        // Return the status
        return bool;
    }
    // Create a bool method named hasLowerCase that accepts the string
        // Create a bool for status and set it to false
        // Check to see if any character in the string is lowercase
    public boolean hasLowerCase(String s)
    {
        boolean bool = false;
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isLowerCase(s.charAt(i)))
            {
                bool = true;
            }
        }
        // If it is, set status to true
        // Otherwise, set status to false
        // Return the status
        return bool;
    }
    

    // Create a bool method named hasDigit that accepts the string
        // Create a bool for status and set it to false
        // Check to see if any character in the string is a number
        // If it is, set status to true
        // If it is, set it to true
        // Otherwise, set status to false
        // Return the status
    public boolean hasDigit(String s)
    {
        boolean bool = false;
        
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isDigit(s.charAt(i)))
            {
                bool = true;
            }
        }
        // If it is, set status to true
        // Otherwise, set status to false
        // Return the status
        return bool;
    }
}