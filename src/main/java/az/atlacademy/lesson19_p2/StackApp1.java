package az.atlacademy.lesson19_p2;

import java.util.Deque;
import java.util.LinkedList;

public class StackApp1 {
    public static void main(String[] args) {
        Deque<String> words = new LinkedList<>();
        words.add("Mercedes");
        words.add("BMW");
        words.add("Hyundai");
        words.add("Kia");
        System.out.println(words);
        System.out.println(words.getFirst());
        System.out.println(words.getLast());
        System.out.println(words.peekLast());
        System.out.println(words.peek());
        System.out.println(words.element());
        System.out.println(words.peekFirst());
        System.out.println(words.pollLast());
        System.out.println(words.pollFirst());
        System.out.println(words.descendingIterator());
        Deque<String> words1 = new LinkedList<>();
        words1.add("Changan");
        words1.add("BMW");
        words1.add("Volvo");
        words1.add("LADA");
        System.out.println(words1);
        System.out.println(words1.getFirst());
        System.out.println(words1.getLast());
        System.out.println(words1.peekLast());
        System.out.println(words1.peek());
        System.out.println(words1.element());
        System.out.println(words1.peekFirst());
        System.out.println(words1.pollLast());
        System.out.println(words1.pollFirst());
        System.out.println(words1.descendingIterator());
        words1.addAll(words);
        System.out.println(words1);

    }
}
