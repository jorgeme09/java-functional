package impertive;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {
        List<Person> people = List.of(
                new Person("Jorge", Gender.MALE),
                new Person("Nay", Gender.FEMALE),
                new Person("Luis", Gender.MALE),
                new Person("Remedios", Gender.FEMALE)
        );

        System.out.println("// Imperative Approach");

        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if(Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("// Declarative Approach");

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);

        List<Person> females1 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());

        females1.forEach(female -> {
            System.out.println(female);
        });
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
