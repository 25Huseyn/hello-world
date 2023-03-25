package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        double square = Math.sqrt(n);
        System.out.printf("%.6f", square);
    }
}