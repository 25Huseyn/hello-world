package az.atlacademy.lesson24;

public class Multi implements Runnable {
    public static void main(String[] args) {
        new Thread(new Multi()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getContextClassLoader());
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.activeCount());
            }
        }).start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState());
    }

}
