package az.atlacademy.lesson21;

import java.util.HashMap;
import java.util.Map;

public class StreamApp {
    public static void main(String[] args) {
        String input = "GARABAGH";

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : input.toCharArray()) {
            int count = charCount.get(c);
            System.out.println("Character: " + c + ", Count: " + count);
        }
    }
}
