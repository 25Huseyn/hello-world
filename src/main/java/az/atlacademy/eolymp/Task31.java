package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0 && !(n < 0 && (n % 3 == 0))) {
            System.out.println("YES");
        } else if (n % 2 != 0 && (n < 0 && (n % 3 == 0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
