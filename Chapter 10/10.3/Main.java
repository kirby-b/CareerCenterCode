import java.util.Scanner;

public class Main {

    /* =====================================================
    ===== Challenge 10.3 - Person and Customer Classes =====
    ========================================================

    Design a class named Person with fields for holding a person's name, address, and telephone
    number. Write one or more constructors and the appropriate mutator and accessor methods
    for the class's fields.

    Next, design a class named Customer, which extends the Person class. The Customer class
    should have a field for a customer number and a boolean field indicating whether the
    customer wishes to be on a mailing list. Write one or more constructors and the appropriate
    mutator and accessor methods for the class's fields. Demonstrate an object of the Customer
    class in a simple program.

    THIS CLASS IS COMPLETE AND CORRECT. DO NOT MODIFY.

     */

    public static void main(String[] args) {
        // Create a Customer object for Julie James.

        // Create variables
        String name, address, phone, custNumber;
        int mList;
        Boolean mailingList;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the customer's name");
        name = keyboard.nextLine();

        System.out.println("Enter the customer's address");
        address = keyboard.nextLine();

        System.out.println("Enter the customer's phone number");
        phone = keyboard.nextLine();

        System.out.println("Enter the customer's customer number");
        custNumber = keyboard.nextLine();

        System.out.println("Is the customer on the mailing list? 0 for 'no,' 1 for 'yes'");
        mList = keyboard.nextInt();

        if(mList == 0) {
            mailingList = false;
        } else {
            mailingList = true;
        }




        Customer myCustomer = new Customer(name, address, phone, custNumber, mailingList);

        // Display the object's data.
        System.out.println("Name: " + myCustomer.getName());
        System.out.println("Address: " + myCustomer.getAddress());
        System.out.println("Telephone: " + myCustomer.getPhone());
        System.out.println("Customer Number: " + myCustomer.getCustomerNumber());
        if (myCustomer.getMailingList())
            System.out.println("Mailing List: YES");
        else
            System.out.println("Mailing List: NO");
    }
}
