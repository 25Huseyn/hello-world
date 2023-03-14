package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 3 == 0 && (n % 2 == 0 && (n > 9 && n < 100) || (n > -100 && n < -9))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
