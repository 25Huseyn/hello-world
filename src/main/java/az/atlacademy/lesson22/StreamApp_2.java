package az.atlacademy.lesson22;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApp_2 {
    public static void main(String[] args) {
        Map<Integer, Long> numbers = new Random()
                .ints(20, 0, 10)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        IntSummaryStatistics stats = numbers
                .keySet()
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        long maxCount = numbers.get(stats.getMax());
        long minCount = numbers.get(stats.getMin());
        System.out.println(numbers);
        System.out.println(maxCount);
        System.out.println(minCount);
    }
}