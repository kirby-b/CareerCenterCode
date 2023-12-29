public class PersonBuilder
{
    private String name;       // A person's name
    private int age;           // A person's age
    private String address;    // A person's address
    private String phone;      // A person's phone number

    /**
     The setName method sets the person's name.
     @param n The person's name.
     */
    public void setName(String person)
    {
       name = person;
    }
    /**
     The setAge method sets the person's age.
     @param a The person's age.
     */
    public void  setAge(int a)
    {
        age = a;
    }
    /**
     The setAddress method sets the person's address.
     @param a The person's address.
     */
    public void setAddress(String location)
    {
        address = location;
    }
    /**
     The setPhone method sets the person's phone number.
     @param p The person's phone number.
     */
    public void setPhone(String contact)
    {
        phone = contact;
    }
    /**
     The getName method returns the person's name.
     @return The person's name.
     */
    public String getName()
    {
        return name;
    }
    /**
     The getAge method returns the person's age.
     @return The person's age.
     */
    public int getAge()
    {
        return age;
    }
    /**
     The getAdress method returns the person's address.
     @return The person's address.
     */
    public String getAddress()
    {
        return address;
    }
    /**
     The getPhone method returns the person's phone number.
     @return The person's phone number.
     */
    public String getPhone()
    {
        return phone;
    }
}
