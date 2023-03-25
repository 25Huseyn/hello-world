package az.atlacademy.mix;

import java.util.Scanner;

public class SumofSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += (i * i);
        }
        System.out.println(sum);
    }
}