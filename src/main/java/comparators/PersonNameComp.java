package comparators;

import person.Person;

import java.util.Comparator;

public class PersonNameComp implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getFirstName().compareTo(p2.getFirstName());
    }
}