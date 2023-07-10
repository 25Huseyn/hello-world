package az.atlacademy.lesson19_p2;


import java.util.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        System.out.println(words);
        words.add("H2");
        System.out.println(words);
        words.add("H3");
        words.add("H4");
        words.add("H5");
        words.add("H2");
        System.out.println(words);
        System.out.println(words.remove());
        System.out.println(words.peek());
        System.out.println(words);
        System.out.println(words.pop());
        System.out.println(words);
        words.clear();
        System.out.println(words);
    }
}
