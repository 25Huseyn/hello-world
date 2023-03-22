package az.atlacademy.mix;

import java.util.Scanner;

public class TaskW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = n % 10;
        int b = (n / 10) % 10;
        int c = n / 100;
        System.out.printf("%.3f", Math.sqrt(a + b + c));

    }
}
