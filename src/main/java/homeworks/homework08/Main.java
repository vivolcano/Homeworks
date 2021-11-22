package homeworks.homework08;

import java.util.Arrays;

public class Main {
    public static Person[] persons = new Person[] {
            new Person("Oleg", 55.9),
            new Person("Ivan", 65.1),
            new Person("Petr", 88.5),
            new Person("Viktor", 44.3),
            new Person("Anna", 105.9),
            new Person("Olga", 77.7),
            new Person("Elena", 56.2),
            new Person("Fedr", 69.4),
            new Person("Vladimir", 34.1),
            new Person("Anastasia", 51.0)
    };

    public static void main(String[] args) {
        Arrays.sort(persons);
        printArr(persons);

        // Arrays.sort(persons, Comparator.comparing(Person::getWeight)); сортировка чезе функциональный интерфейс

    }

    private static void printArr(Person[] persons) {
        for (Person value : persons) {
            System.out.println(value);
        }
    }

}

