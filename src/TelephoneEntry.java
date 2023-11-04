public abstract class TelephoneEntry {
    private TelephoneNumber telephoneNumber;

    public TelephoneEntry(TelephoneNumber telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public abstract String description();

    public TelephoneNumber getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(TelephoneNumber telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
