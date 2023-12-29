public class PhoneTranslator
{
    // This creates a StringBuilder variable named "translated"
    private StringBuilder translatedNum;

    // Create a constructor named PhoneTranslator that accepts a string
    public PhoneTranslator(String s)
    {
        // Create a new StringBuilder that holds the translated number
        translatedNum = new StringBuilder(s);
        // Create a loop to step through each character of the loop
        for (int i = 0; i < s.length(); i++)
        {
            char p = 'p';
            p = translatedNum.charAt(i);
            CharacterTranslator ct = new CharacterTranslator();
            // Translate the given character using the CharacterTranslator class
            translatedNum.setCharAt( i, ct.getPhoneDigit(p));
            // Append the returned character to the translated StringBuilder object
        }
    }
    // Create a string returning method named getTranslated that accepts no arguments
    public String getTranslated()
    {
        
        // Return translated as a string.
        return translatedNum.toString();
    }
}