package az.atlacademy.lesson22;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApp {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> numbers = IntStream.range(0, 100)
                .map(i -> random.nextInt(25))
                .boxed()
                .collect(Collectors.toList());

        Map<Integer, Long> countMap = numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        Optional<Map.Entry<Integer, Long>> maxEntry = countMap.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        System.out.println(countMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
        System.out.println("Maximum Number: " + maxEntry.map(Map.Entry::getKey).orElse(null) + " " + "Count" + " " + maxEntry.map(Map.Entry::getValue).orElse(0L));

    }
}
