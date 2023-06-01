package az.atlacademy.lesson24;

public class ThreadApp {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread());
    }
}
