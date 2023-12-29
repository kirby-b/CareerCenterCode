
// THIS CLASS IS COMPLETE AND CORRECT. DO NOT MODIFY.

public class Essay extends GradedActivity
{
    private double grammar;          // Points for grammar
    private double spelling;         // Points for spelling
    private double correctLength;    // Points for length
    private double content;          // Points for content

    public void setScore(double gr, double sp, double len, double cnt)
    {
        // Set the individual scores.
        setGrammar(gr);
        setSpelling(sp);
        setCorrectLength(len);
        setContent(cnt);

        // Set the total score.
        super.setScore(grammar + spelling + correctLength + content);
    }

    private void setGrammar(double g)
    {
        if (g <= 30.0)
            grammar = g;
        else                 // Invalid points
            grammar = 0.0;
    }

    private void setSpelling(double s)
    {
        if (s <= 20.0)
            spelling = s;
        else                 // Invalid points
            spelling = 0.0;
    }

    private void setCorrectLength(double c)
    {
        if (c <= 20.0)
            correctLength = c;
        else                 // Invalid points
            correctLength = 0.0;
    }

    private void setContent(double c)
    {
        if (c <= 30)
            content = c;
        else                 // Invalid points
            content = 0.0;
    }

    public double getGrammar()
    {
        return grammar;
    }
    public double getSpelling()
    {
        return spelling;
    }
    public double getCorrectLength()
    {
        return correctLength;
    }
    public double getContent()
    {
        return content;
    }

    @Override
    public double getScore()
    {
        return grammar + spelling + correctLength + content;
    }
}

