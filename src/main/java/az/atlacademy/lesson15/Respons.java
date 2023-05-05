package az.atlacademy.lesson15;

import java.util.Objects;

public class Respons<T , U>{
    private final T t;
    private final U u;

    public Respons(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public U getU() {
        return u;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Respons<?, ?> respons = (Respons<?, ?>) o;
        return Objects.equals(t, respons.t) && Objects.equals(u, respons.u);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, u);
    }

    @Override
    public String toString() {
        return "Respons{" +
                "t=" + t +
                ", u=" + u +
                '}';
    }
}
