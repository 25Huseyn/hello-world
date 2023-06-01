package az.atlacademy.lesson24;

public class Multithreading extends Thread {
    public static void main(String[] args) {
            new Multithreading().run();
    }
    String name = Thread.currentThread().getName();
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(name);
        }
    }
}
