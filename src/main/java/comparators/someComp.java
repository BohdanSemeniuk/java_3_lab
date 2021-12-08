package comparators;

import person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class someComp {
    public List<Person> sortByAge(List<Person> persons){
        persons.sort(new PersonAgeComp());
        return persons;
    }

    public List<Person> sortByAgeWithStream(List<Person> persons){
        return persons.stream().sorted(new PersonAgeComp()).collect(Collectors.toList());
    }

    public List<Person> sortByName(List<Person> persons){
        persons.sort(new PersonNameComp());
        return persons;
    }

    public List<Person> sortByNameWithStream(List<Person> persons){
        return persons.stream().sorted(new PersonNameComp()).collect(Collectors.toList());
    }

    public List<Person> FilterHeight(List<Person> persons, int height)
    {
        List<Person> result = new ArrayList<>();
        for (var anm : persons)
        {
            if (anm.getHeight() >= height)
            {
                result.add(anm);
            }
        }
        return result;
    }

    public List<Person> FilterHeightStream(List<Person> persons, int height)
    {
        return persons.stream().filter(a -> a.getHeight() >= height).toList();
    }

    public List<Person> nameContainsSymbol(List<Person> persons, String x){
        List<Person> result = new ArrayList<>();
        for (Person person: persons) {
            if(person.getFirstName().contains(x)){
                result.add(person);
            }
        }
        return result;
    }

    public Person searchByName(List<Person> persons, String name){
        for (Person person: persons){
            if(Objects.equals(person.getFirstName(), name)){
                return person;
            }
        }
        return null;
    }
}