package az.atlacademy.mix;

import java.util.Scanner;

public class Function05App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        System.out.println((x * y * z) + x + (y * y) + (z * z * z));
    }
}