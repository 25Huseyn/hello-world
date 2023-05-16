package az.atlacademy.lesson19_p2;

import java.util.LinkedList;
import java.util.Queue;

public class StackApp {
    public static void main(String[] args) {
        Queue<String> words = new LinkedList<>();
        words.add("Apple");
        words.add("HP");
        words.add("Toshiba");
        words.add("ASUS");
        System.out.println(words);
        System.out.println(words.remove());
        System.out.println(words.element());
        System.out.println(words.offer("Redmi"));
        System.out.println(words.peek());
        System.out.println(words.poll());
        System.out.println(words.contains("Toshiba"));
        System.out.println(words.isEmpty());
        System.out.println(words.size());
        words.clear();
        System.out.println(words);
    }
}
