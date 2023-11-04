public class TelephoneNumber implements Comparable<TelephoneNumber>{
    private String countryCode;
    private String localNumber;

    public TelephoneNumber(String countryCode, String localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }

    @Override
    public int compareTo(TelephoneNumber other) {
        int countryCodeComparison =  this.countryCode.compareTo(other.countryCode);
        if(countryCodeComparison == 0){
          return this.localNumber.compareTo(other.localNumber);
        }
        return countryCodeComparison;
    }

    public String toString(){
        return countryCode + " " +localNumber;
    }
}

