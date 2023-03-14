package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 != 0 || (n > 99 && n<1000)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}