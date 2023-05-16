package az.atlacademy.lesson20;

import java.util.LinkedList;
import java.util.Queue;

public class OrderApp {
    public static void main(String[] args) {
        Queue<Order> words = new LinkedList<>();
        makerOrder(words);
        System.out.println(words);
        proccessOrder(words);
        System.out.println(words);
    }
    public static void proccessOrder(Queue<Order> words) {
        words.poll();
    }
    public static void makerOrder(Queue<Order> words) {
        words.add(new Order());
    }


}
