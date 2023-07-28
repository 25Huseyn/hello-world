package az.atlacademy.exam1;

import java.util.Objects;

public class Items {
    private int item_id;
    private String item_type;
    private Double item_price;

    public Items(int item_id, String item_type, Double item_price) {
        this.item_id = item_id;
        this.item_type = item_type;
        this.item_price = item_price;
    }

    public Items(String item_type, Double item_price) {
        this.item_type = item_type;
        this.item_price = item_price;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public Double getItem_price() {
        return item_price;
    }

    public void setItem_price(Double item_price) {
        this.item_price = item_price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return item_id == items.item_id && Objects.equals(item_type, items.item_type) && Objects.equals(item_price, items.item_price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item_id, item_type, item_price);
    }

    @Override
    public String toString() {
        return "items{item_id=%d, item_type='%s', item_price=%s}".formatted(item_id, item_type, item_price);
    }
}
