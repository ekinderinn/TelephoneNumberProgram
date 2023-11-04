public class Address {
    private String streetName;
    private String cityName;
    private String streetNumber;

    public Address(String streetName, String cityName, String streetNumber) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.streetNumber = streetNumber;
    }

    public String toString(){
        return cityName + ", " + streetName + " " +streetNumber;
    }
}
