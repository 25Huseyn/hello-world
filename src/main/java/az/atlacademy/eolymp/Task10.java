package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (a >= b && a >= c && a >= d) {
            System.out.println(a);
        } else if (b >= a && b >= c && b >= d) {
            System.out.println(b);
        } else if (c >= a && c >= b && c >= d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}
