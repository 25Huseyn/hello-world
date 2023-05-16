package az.atlacademy.lesson20;

public class Order {

    private int id;


    public Order(int id) {
        this.id = id;
    }

    public Order() {
        id = (int) (Math.random() * 10);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                '}';
    }
}
