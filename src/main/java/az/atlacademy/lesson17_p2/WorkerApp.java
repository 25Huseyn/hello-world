package az.atlacademy.lesson17_p2;

import java.util.Arrays;

public class WorkerApp {
    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("Corc", "HR", 1263, 24, 300.00),
                new Worker("Linda", "HR", 5643, 22, 300.00),
                new Worker("Jane", "Manager", 5673, 21, 450.00),
                new Worker("Tom", "Boss", 6723, 45, 1200.50),
                new Worker("Kane", "Programmer", 9348, 34, 1000.00),
                new Worker("Kevin", "Programmer", 8716, 43, 1000.00),
        };
        System.out.println(Arrays.toString(workers));
        Arrays.sort(workers);
        System.out.println(Arrays.toString(workers));
        System.out.println("======");
        System.out.println(Arrays.toString(workers));
        Arrays.sort(workers, new WorkerComperator());
        System.out.println(Arrays.toString(workers));
        System.out.println("======");
        Arrays.stream(workers).forEach(worker -> System.out.println(worker));
        Arrays.stream(workers).forEach(System.out::println);
    }
}
