package az.atlacademy.mix;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        System.out.println(a * a + b * b);
    }
}
