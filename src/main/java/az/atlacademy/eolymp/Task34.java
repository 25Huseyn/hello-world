package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if ((n % 2 == 0 && n < 0) || ((n % 2 != 0) && (n > 0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
