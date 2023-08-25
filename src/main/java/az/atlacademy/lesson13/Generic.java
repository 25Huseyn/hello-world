package az.atlacademy.lesson13;

public class Generic {
    public static void main(String[] args) {

    }

    public static <E> E getOrElse(E data) {
        if (data == null) {
            throw new NullPointerException("invalid input");
        }
        return data;
    }
}
