package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleQ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long degree = 1;
        while (degree < n) {
            degree *= 2;
        }
        if (degree == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
