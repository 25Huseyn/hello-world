package az.atlacademy.lesson17;

import az.atlacademy.lesson16.Student;
import az.atlacademy.lesson16_p2.Player;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PersonApp {
    public static void main(String[] args) {
        Person[] persons = {
                new Person(1, "Player4", 23, 56.4),
                new Person(2, "Player1", 23, 56.4),
                new Person(3, "Player3", 23, 56.4),
                new Person(4, "Player2", 45, 67.5)
        };
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons, new Comperator());
        System.out.println(Arrays.toString(persons));
        Arrays.stream(persons).forEach(player -> System.out.println(player));
        Arrays.stream(persons).forEach(System.out::println);
    }
}
