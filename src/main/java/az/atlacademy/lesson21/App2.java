package az.atlacademy.lesson21;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Set;

public class App2 {
    public static void main(String[] args) {
        List<Integer> evenNums = new Random().ints(20, 1, 50).filter(num -> num % 2 ==0).boxed().collect(Collectors.toList());
        System.out.println(evenNums);
        Set<Integer> filteredNums = evenNums.stream().filter(num -> num > 10 && num < 30).collect(Collectors.toSet());
        System.out.println(filteredNums);
    }
}
