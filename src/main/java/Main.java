import person.Person;
import comparators.someComp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        someComp c = new someComp();

        Person person1 = new Person.Builder()
                .setFirstName("Max")
                .setLastName("Petrenko")
                .setAge(22)
                .setHeight(177)
                .setWeight(70)
                .createPerson();

        Person person2 = new Person.Builder()
                .setFirstName("Andrew")
                .setLastName("Melnyk")
                .setAge(35)
                .setHeight(185)
                .setWeight(78)
                .createPerson();

        Person person3 = new Person.Builder()
                .setFirstName("Sasha")
                .setLastName("Vasylenko")
                .setAge(21)
                .setHeight(173)
                .setWeight(55)
                .createPerson();


        List<Person> People = Arrays.asList(person1, person2, person3);


        System.out.println("\nSorted people by year:");
        c.sortByAge(People).forEach(a -> System.out.println("\t" + a));

        System.out.println("\nSorted people by name:");
        c.sortByNameWithStream(People).forEach(a -> System.out.println("\t" + a));

        String name = "Sasha";
        System.out.println("\nSearch person by name: " + name);
        System.out.println(c.searchByName(People, name));

        String symbol = "a";
        System.out.println("\nSearch people by name that have symbol: " + symbol);
        c.nameContainsSymbol(People, symbol).forEach(a -> System.out.println("\t" + a));

        int height = 175;
        System.out.println("\nFilter people by height: " + height);
        c.FilterHeight(People, height).forEach(a -> System.out.println("\t" + a));
    }
}
