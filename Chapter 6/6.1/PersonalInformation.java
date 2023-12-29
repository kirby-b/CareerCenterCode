public class PersonalInformation{

    /* ===================================================
    ===== Challenge 6.1 - Personal Information Class =====
    ======================================================

    Design a class that holds the following personal data: name, age, and phone number.
    Write appropriate accessor and mutator methods. Demonstrate the class by writing a
    program that creates three instances of it. One instance should hold your information,
    and the other two should hold your friends' or family member's information.

     */

    public static void main(String[] args) {
        // Create three PersonlInformation objects named myInfo, myFriend1, and myFriend2

        // Set myInfo as follows by calling the appropriate methods:
        // Name: "Joe Mahoney"
        // Age: 27
        // Address: "724 22nd Street"
        // Phone: "(555)555-1234"

        // Set myFriend1's info as following by calling the appropriate methods:
        // Name: "Geri Rose"
        // Age: 24
        // Address: "149 East Bay Street"
        // Phone: "(555)555-5678"

        // Set myFriend2's info as following by calling the appropriate methods:
        // Name: "John Carbonni"
        // Age: 28
        // Address: "22 King Street"
        // Phone: "(555)555-0123"


        // Display myInfo as follows by calling the appropriate methods:
        // My information:
        // Name: Joe Mahoney
        // Age: 27
        // Address: 724 22nd Street

        // Display myFriend1's info as follows by calling the appropriate methods:
        // Friend 1's information:
        // Name: Geri Rose
        // Age: 24
        // Address: 149 East Bay Street
        // Phone: (555)555-5678

        // Display myFriend2's info as follows by calling the appropriate methods:
        // Friend 2's information:
        // Name: John Carbonni
        // Age: 28
        // Address: 22 King Street
        // Phone: (555)555-0123


        
        me();
        friendo1();
        friendo2();
        

    
    }
    public static void me()
        {
            PersonBuilder myInfo = new PersonBuilder();  
            myInfo.setAddress("724 22nd Street");
            myInfo.setName("Joe Mahoney");
            myInfo.setAge(27);
            myInfo.setPhone("(555)555-1234");

            System.out.println("My information:");
            System.out.println("Name: " + myInfo.getName());
            System.out.println("Age: " + myInfo.getAge());
            System.out.println("Address: " + myInfo.getAddress());
            System.out.println("Phone: " + myInfo.getPhone());
        }
    public static void friendo1()
        {
            PersonBuilder myFriend1 = new PersonBuilder();
            myFriend1.setAddress("149 East Bay Street");
            myFriend1.setName("Geri Rose");
            myFriend1.setAge(24);
            myFriend1.setPhone("(555)555-5678");
            System.out.println("\nFriend #1's information:");
            System.out.println("Name: " + myFriend1.getName());
            System.out.println("Age: " +  myFriend1.getAge());
            System.out.println("Address: " + myFriend1.getAddress());
            System.out.println("Phone: " + myFriend1.getPhone());
        }
    public static void friendo2()
        {
            PersonBuilder myFriend2 = new PersonBuilder();
            myFriend2.setAddress("22 King Street");
            myFriend2.setName("John Carbonni");
            myFriend2.setAge(28);
            myFriend2.setPhone("(555)555-0123");
            System.out.println("\nFriend #2's information:");
            System.out.println("Name: " + myFriend2.getName());
            System.out.println("Age: " + myFriend2.getAge());
            System.out.println("Address: " + myFriend2.getAddress());
            System.out.print("Phone: " + myFriend2.getPhone());
        }
}
