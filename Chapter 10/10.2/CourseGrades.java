// Create a class named CourseGrades
class CourseGrades {
    // Create a final int named NUM_GRADES and set it to 4
    int NUM_GRADES = 4;
    // Create a GradedActivity array named grades
    GradedActivity[] grades = {};
    // Create a no-arg constructor named CourseGrades
    public CourseGrades()
    {
        // Set the GradedActivity to the value of the GradedActivity array with NUM_GRADES elements.
        grades = new GradedActivity[NUM_GRADES];
    }
    // Create a void method named setLab that accepts a GradedActivity object
    public void setLab(GradedActivity g)
    {
        // Set the GradedActivity at element 0 to the value entered
        grades[0] = g;
    }
    // Create a void method named setPassFailExam that accepts a PassFailExam object
    public void setPassFailExam(PassFailExam p)
    {
        // Set the GradedActivity at element 1 to the value entered
        grades[1] = p;
    }
    // Create a void method named setEssay that accepts an Essay object
    public void setEssay(Essay e)
    {
        // Set the GradedActivity at element 2 to the value entered
        grades[2] = e;
    }
    // Create a void method named setFinalExam that accepts a FinalExam object
    public void setFinalExam(FinalExam f)
    {
        // Set the GradedActivity at element 3 to the value entered
        grades[3] = f;
    }
    // Create a String returning method named toString
    public String toString()
    {
        // Create a string that outputs the following (Note the formatting)
        String str = "";
        // "Lab Score: (Lab grade score as a number)"
        str = str + "Lab Score: " + grades[0].getScore(); 
        // "\tGrade: (Lab grade grade as a letter)"
        str = str + "\tGrade: " + grades[0].getGrade();
        // "\nPass/Fail Exam Score: (Pall/Fail Exam score as a number)"
        str = str + "\nPass/Fail Exam Score: " + grades[1].getScore();
        // "\tGrade: (Pass/Fail Exam grade as a letter)"
        str = str + "\tGrade: " + grades[1].getGrade();
        // "\nEssay Score: (Essay score as a number)"
        str = str + "\nEssay Score: " + grades[2].getScore();
        // "\tGrade: (Essay grade as a letter)"
        str = str + "\tGrade: " + grades[2].getGrade();
        // "\nFinal Exam Score: (Final Exam score as a number)"
        str = str + "\nFinal Exam Score: " + grades[3].getScore();
        // "\tGrade: (Final Exam grade as a letter)"
        str = str + "\tGrade: " + grades[3].getGrade();

        // Return the string
        return str;
    }
}