package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a % b == 0) {
            System.out.println("Divisible");
        } else {
            System.out.print(a / b + " " + (a % b));
        }
    }
}
