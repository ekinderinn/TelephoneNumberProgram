public class Person extends TelephoneEntry{
    private String name;
    private String lastName;
    private Address address;

    public Person(String name, String lastname, Address address, TelephoneNumber telephoneNumber) {
        super(telephoneNumber);
        this.name = name;
        this.lastName = lastname;
        this.address = address;
    }

    @Override
    public String description(){
        return "Name: " + name + "\nLastname: " + lastName + "\nAddress: " + address.toString() + "\nTelephone Number: " + getTelephoneNumber().toString();
    }

}
