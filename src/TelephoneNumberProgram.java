import java.util.Iterator;
import java.util.TreeMap;

public class TelephoneNumberProgram {
    public static void main(String[] args) {
        Person person1 = new Person("Percy","Jackson",new Address("Piotrkowska","Lodz","36"),new TelephoneNumber("+49","324756758"));
        Person person2 = new Person("Amelia","Pattinson",new Address("Piotrkowska","Lodz","2"),new TelephoneNumber("+49","849350124"));
        Person person3 = new Person("Mike","Timberlake",new Address("Piotrkowska","Lodz","13"),new TelephoneNumber("+48","463590150"));

        Company company1 = new Company("Google", new Address("10th Avenue","New York","5"),new TelephoneNumber("+32","927486391"));
        Company company2 = new Company("Microsoft", new Address("Subwaysurfers","Brooklyn","61"),new TelephoneNumber("+35","870264780"));
        Company company3 = new Company("Linux", new Address("Italiano","Rome","21"),new TelephoneNumber("+32","646978124"));

        TreeMap<TelephoneNumber, TelephoneEntry> map = new TreeMap<>();

        map.put(person1.getTelephoneNumber(),person1);
        map.put(person2.getTelephoneNumber(),person2);
        map.put(person3.getTelephoneNumber(),person3);
        map.put(company1.getTelephoneNumber(),company1);
        map.put(company2.getTelephoneNumber(),company2);
        map.put(company3.getTelephoneNumber(),company3);

        Iterator<TelephoneNumber> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            TelephoneNumber key = iterator.next();
            TelephoneEntry entry = map.get(key);
            System.out.println(entry.description());
            System.out.println();
        }
    }
}