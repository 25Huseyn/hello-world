package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long y = 0;
        if (x < -4) {
            y = x + 5;
        } else if (x > 7) {
            y = x * x * x + 2 * x;
        } else {
            y = x * x - 3 * x;
        }
        System.out.println(y);
    }
}
