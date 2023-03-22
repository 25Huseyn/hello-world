package az.atlacademy.mix;

import java.util.Scanner;

public class TaskQ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            System.out.println("YES");
        } else if (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
            System.out.println("YES");
        } else if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

