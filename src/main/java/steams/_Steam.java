package steams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _Steam {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jorge", Gender.MALE),
                new Person("Nay", Gender.FEMALE),
                new Person("Luis", Gender.MALE),
                new Person("Remedios", Gender.FEMALE),
                new Person("Nilo", Gender.PREFER_NOT_TO_SAY)
        );

        Set<Gender> genders = people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet());

        IntStream lengthOfNames = people.stream()
                .mapToInt(person -> person.name.length());

        boolean allPeopleAreFemale = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(allPeopleAreFemale);

        boolean anyPersonOnPeopleIsFemale = people.stream()
                .anyMatch(person -> Gender.PREFER_NOT_TO_SAY.equals(person.gender));
        System.out.println(anyPersonOnPeopleIsFemale);

        genders.forEach(gender -> System.out.println(gender));
        lengthOfNames.forEach(lengthOfName -> System.out.println(lengthOfName));
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
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
