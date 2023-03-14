package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = num / 1000;
        int b = ((num / 100) % 10);
        int c = ((num / 10) % 10);
        int d = num % 10;
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
            System.out.println("NO");
        } else if (num % a == 0 && num % b == 0 && num % c == 0 & num % d == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
