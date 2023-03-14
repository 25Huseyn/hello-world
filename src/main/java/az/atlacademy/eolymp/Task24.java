package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        if (n > 0 && m > 0 || n < 0 && m < 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
