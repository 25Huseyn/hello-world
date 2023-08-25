package az.atlacademy.lesson17;

import az.atlacademy.lesson16.Student;
import az.atlacademy.lesson16_p2.Player;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PersonApp {
    public static void main(String[] args) {
        Person[] persons = {new Person(1, "Person4", 23, 56.4), new Person(2, "Person1", 23, 56.4), new Person(3, "Person3", 23, 56.4), new Person(4, "Person2", 45, 67.5)};
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
        System.out.println("======");
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons, new Comperator());
        System.out.println(Arrays.toString(persons));
        System.out.println("======");
        Arrays.stream(persons).forEach(person -> System.out.println(person));
        Arrays.stream(persons).forEach(System.out::println);
        System.out.println("======");
    }
}
