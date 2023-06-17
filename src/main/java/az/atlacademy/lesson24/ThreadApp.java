package az.atlacademy.lesson24;

public class ThreadApp {
    public static void main(String[] args) {
        new Multithreading().start();
        new Multithreading().run();
        for (int i = 0; i < 9; i++) {
            System.out.println("Hello");
        }
    }
}
