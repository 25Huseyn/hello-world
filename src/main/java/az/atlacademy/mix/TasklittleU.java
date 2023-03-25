package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleU {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long y = scan.nextLong();
        long z = scan.nextLong();

        System.out.println((x * y * z) + x + (y * y) + (z * z * z));
    }
}
