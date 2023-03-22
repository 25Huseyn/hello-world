package az.atlacademy.mix;

import java.math.MathContext;
import java.util.Scanner;

public class TasklittleA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        if ((k >= 0) && (n <= 30)) {
            System.out.println((int) (Math.pow(2, k) + Math.pow(2, n)));
        }
    }
}
