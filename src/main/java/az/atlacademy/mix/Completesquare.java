package az.atlacademy.mix;

import java.util.Scanner;

public class Completesquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = (int) Math.sqrt(n);
        if (m * m == n) {
            System.out.println(m);
        } else {
            System.out.println("No");
        }
    }
}