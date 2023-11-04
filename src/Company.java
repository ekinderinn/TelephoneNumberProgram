public class Company extends TelephoneEntry{
    private String name;
    private Address address;

    public Company(String name, Address address, TelephoneNumber telephoneNumber) {
        super(telephoneNumber);
        this.name = name;
        this.address = address;
    }

    @Override
    public String description(){
        return "Name: " + name + "\nAddress: " + address.toString() + "\nTelephone Number: " + getTelephoneNumber().toString();
    }
}
