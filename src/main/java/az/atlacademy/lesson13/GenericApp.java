package az.atlacademy.lesson13;

import java.util.Optional;

public class GenericApp {
    public static void main(String[] args) {
        String name = " ";
        System.out.println(isEmpty(name));
    }

    public static Optional<String> isEmpty(String names) {
        return (names == null || names.isEmpty()) ? Optional.empty() : Optional.of(names);
    }
}
