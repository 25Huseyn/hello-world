package az.atlacademy.repetition.rawType;

public class Box<T> {
    private T t;

    public Box() {
        this.t = t;
    }

    public T get(T t) {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
    public <U extends Number> void inspect(U u){
        System.out.println("t: " + t.getClass().getName());
        System.out.println("u: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(10);
        integerBox.inspect(20);
    }


}
