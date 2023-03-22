package az.atlacademy.mix;

import java.util.Scanner;

public class SumofSquares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            long squar =  i * i;
            sum += squar;
        }
        System.out.println(sum);
    }
}