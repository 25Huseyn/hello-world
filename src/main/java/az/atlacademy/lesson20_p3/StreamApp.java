package az.atlacademy.lesson20_p3;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApp {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hello");
        listOfStrings.add("World");
        listOfStrings.add("!");
        listOfStrings.stream().forEach(System.out::println);
//task2
        String str = "Hello, World!";

        Stream.of(str)
                .mapToInt(String::length)
                .forEach(System.out::println);
//task 3
        String[] strings = { "Hello", "World", "!", "Java", "Stream" };


        Stream.of(strings)
                .filter(s -> s.length() > 3)
                .map(String::length)
                .forEach(System.out::println);
//task 4
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");
        list.add("Java");
        list.add("Stream");


        int sum = list.stream()
                .filter( str1 -> str1.length() >= 3)
                .mapToInt(String::length)
                .sum();

        System.out.println("Sum of sizes: " + sum);
    }
}
