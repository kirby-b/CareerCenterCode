// Create a class named CharacterTranslator
class CharacterTranslator
{
    public char getPhoneDigit(char c)
    {
    // Create a character returning method named getPhoneDigit that accepts a character
    // Create a character variable to hold the character
    char digit = '1';

        // Convert the character to uppercase
        c = Character.toUpperCase(c);
        // Use a series of else-if statements to see if the character matches a letter
        // Use the following table for conversion:

            // 2 = A, B, C
            // 3 = D, E, F
            // 4 = G, H, I
            // 5 = J, K, L
            // 6 = M, N, 0
            // 7 = P, Q, R, S
            // 8 = T, U, V
            // 9 = W, X, Y, Z
        if (c == 'A' || c == 'B' || c == 'C')
            digit = '2';
        else if (c == 'D' || c == 'E' || c == 'F')
            digit = '3';
        else if (c == 'G' || c == 'H' || c == 'I')
            digit = '4';
        else if (c == 'J' || c == 'K' || c == 'L')
            digit = '5';
        else if (c == 'M' || c == 'N' || c == 'O')
            digit = '6';
        else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S')
            digit = '7';
        else if (c == 'T' || c == 'U' || c == 'V')
            digit = '8';
        else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z')
            digit = '9';
        else 
            digit = c;
        // If the character doesn't match anything in the table, just copy the character

        // Return the digit
        return digit;
    }
}