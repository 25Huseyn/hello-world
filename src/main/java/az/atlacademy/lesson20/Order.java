package az.atlacademy.lesson20;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public final class Order<T> {

    private final T id;
    private final LocalDateTime orderDate;

    public Order(T id) {
        this.id = id;
        this.orderDate = LocalDateTime.now();
    }

    public T getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order<?> order = (Order<?>) o;
        return Objects.equals(id, order.id) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderDate);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                '}';
    }
}
