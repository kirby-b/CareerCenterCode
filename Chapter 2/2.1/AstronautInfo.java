public class AstronautInfo {

    public static void main(String[] args) {

        /*
        ================================================================
        ========== Programming Challenge 2.1 - Astronaut Info ==========
        ================================================================

        Welcome aboard to the Universal Space Initiative (USI). 

        Since you are a new software engineer for USI, we need to make 
        sure that you can code before we trust you with the lives of our 
        astronauts.

        Your first task is simple. We need to record some information 
        about our astronauts. 

        Please write a program that first does the following:
            - Creates a String variable to hold the astronaut's name.
            - Creates an int variable to hold the atronaut's age.
            - Creates a String variable to hold the astronaut's rank.
            - Create a double variable to hold how long the astronaut
                has been in space.

        After that, you should store the following values for testing:
            - Name: Buzz Aldrin
            - Age: 90
            - Rank: colonel
            - Space time: 12.0784

        Last, use the variables to display the following message
        exactly as it is written below:

        Buzz Aldrin is 90 years old.
        He is a colonel and has spent 12.0784 days in space.

         */
        String name = "Buzz Aldrin";
        int age = 90;
        String rank = "colonel";
        double timeInSpace = 12.0784;
        System.out.println(name + " is "+ age + " years old.\n" + "He is a " + rank + " and has spent " + timeInSpace + " days in space.");




    }
}
