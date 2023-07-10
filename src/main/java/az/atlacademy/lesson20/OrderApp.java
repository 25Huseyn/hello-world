package az.atlacademy.lesson20;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.UUID;

public class OrderApp {
    private static final Queue<Order<String>> queue = new LinkedList<>();

    public static void main(String[] args) {

    }

    public static String makerOrder() {
        final String id = UUID.randomUUID().toString();
        queue.add(new Order<>(id));
        return id;
    }

    public static Optional<String> processOrder() {
        final Order<String> order = queue.peek();
        if (order == null) {
            return Optional.empty();
        }
        queue.poll();
        return Optional.of(order.getId());
    }
}
