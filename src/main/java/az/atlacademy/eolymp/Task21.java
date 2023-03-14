package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (x >= a && x <= b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}