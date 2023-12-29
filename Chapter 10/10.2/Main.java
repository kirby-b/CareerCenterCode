import java.util.Scanner;

public class Main {

    /* =======================================
    ===== Challenge 10.2 - Course Grades =====
    ==========================================

    In a course, a teacher gives the following tests and assignments:

        - A lab activity that is observed by the teacher and assigned a numeric score.
        - A pass/fail exam that has 10 questions. The minimum passing score is 70.
        - An essay that is assigned a numeric score.
        - A final exam that has 50 questions.

    Write a class named CourseGrades. The class should have a GradedActivity array named
    grades as a field. The array should have four elements, one for each of the following
    assignments previously described. The class should have the following methods:

    setLab:             This method should accept a GradedActivity object as its argument.
                        This object should already hold the student's score for the lab
                        activity. Element 0 of the grades field should reference this object.

    setPassFailExam:    This method should accept a PassFailExam object as its argument. This
                        object should already hold the student's score for the pass/fail exam.
                        Element 1 of the grades of the grades field should reference this object.

    setEssay:           This method should accept an Essay object as its argument. (The Essay
                        class is provided to you for this assignment.)  This object should
                        already hold the student's score for the essay. Element 2 of the grades
                        field should reference this object.

    setFinalExam:       This method should accept a Final Exam object as its argument. This
                        object should already hold the student's score for the final exam.
                        Element 3 of the grades field should reference this object.

    toString:           This method should return a string that contains the numeric scores
                        and grades for each element in the grades array.

    The main class is provided, your job is to connect and build each of the missing classes.

     */

    public static void main(String[] args) {

        // Establish variables and scanner
        double gradedActivityScore;
        int pfMissed;
        int essayContent;
        int finalMissed;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the lab score");
        gradedActivityScore = keyboard.nextDouble();

        System.out.println("Enter the number wrong on the pass/fail exam");
        pfMissed = keyboard.nextInt();

        System.out.println("Enter the content score for the essay");
        essayContent = keyboard.nextInt();

        System.out.println("Enter the number wrong on the final");
        finalMissed = keyboard.nextInt();

        // Create an object for the lab grade.
        GradedActivity lab = new GradedActivity();
        // Set the lab socre at 85.
        lab.setScore(gradedActivityScore);

        // Create an object for the pass/fail exam.
        // 20 total questions, 3 questions missed, minimum
        // passing score is 70.
        PassFailExam pfexam = new PassFailExam(20, pfMissed, 70);

        // Create an object for the essay grade.
        Essay essay = new Essay();
        // Set the essay scores. Grammer = 25, spelling = 18
        // length = 17, content = 20.
        essay.setScore(25, 18, 17, essayContent);

        // Create an object for the final exam.
        // 50 questions, 10 missed.
        FinalExam finalExam = new FinalExam(50, finalMissed);

        // Create a CourseGrades object.
        CourseGrades course = new CourseGrades();
        course.setLab(lab);
        course.setPassFailExam(pfexam);
        course.setEssay(essay);
        course.setFinalExam(finalExam);

        // Display the scores and grades.
        System.out.println(course);
    }
}
