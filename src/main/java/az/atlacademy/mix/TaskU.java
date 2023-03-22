package az.atlacademy.mix;

import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int prod = 1;
        double sum = 0;
        while (N > 0) {
            int rest = N % 10;
            prod *= rest;
            sum += rest;
            N = N / 10;
        }
        System.out.printf("%.3f", (prod / sum));
    }
}
