import java.util.Scanner;

public class Main {

    /* =================================================
    ===== Challenge 10.4 - PreferredCustomer Class =====
    ====================================================

    A retail store has a preferred customer plan where customers can earn discounts on all their
    purchases. The amount of customer's discount is determined by the amount of the customer's
    cumulative purchases in the store as follows.

        - When a preferred customer spends $500, he or she gets a 5 percent discount on all
          future purchases.
        - When a preferred customer spends $1,000, he or she gets a 6 percent discount on all
          future purchases.
        - When a preferred customer spends $1,500, he or she gets a 7 percent discount on all
          future purchases.
        - When a preferred customer spends $2,000, he or she gets a 10 percent discount on all
          future purchases.

    Design a class named PreferredCustomer, which extends the Customer class you created in
    Programming Challenge 10-7. The PreferredCustomer class should have fields for the
    constructors and the appropriate mutator and accessor methods for the class's fields.
    Demonstrate the class in a simple program.

    THIS CLASS IS COMPLETE, CORRECT, AND DONE. DO NOT MODIFY.

     */

    public static void main(String[] args) {

        // Create variables
        String name, address, phone, custNumber;
        int mList;
        double purchased;
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

        System.out.println("Enter how much the customer has spent");
        purchased = keyboard.nextDouble();

        System.out.println("Is the customer on the mailing list? 0 for 'no,' 1 for 'yes'");
        mList = keyboard.nextInt();

        if(mList == 0) {
            mailingList = false;
        } else {
            mailingList = true;
        }

        // Create variables and scanner
        // Create a PreferredCustomer object for Julie James.
        // She has $1750.00 in purchases. That entitles her
        // to a 7% discount on future purchases.
        PreferredCustomer myCustomer =
                new PreferredCustomer(name, address,
                        phone, custNumber,
                        mailingList, purchased);

        // Display the object's data.
        System.out.println("Name: " + myCustomer.getName());
        System.out.println("Address: " + myCustomer.getAddress());
        System.out.println("Telephone: " + myCustomer.getPhone());
        System.out.println("Customer Number: " +
                myCustomer.getCustomerNumber());

        if (myCustomer.getMailingList())
            System.out.println("Mailing List: YES");
        else
            System.out.println("Mailing List: NO");

        System.out.printf("Purchases: $%,.2f\n",
                myCustomer.getPurchases());
        System.out.println("Discount level: " +
                (myCustomer.getDiscountLevel() * 100) + "%");
    }
}
