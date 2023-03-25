package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * (i + 1));
        }
        System.out.printf("%.6f", sum);
    }
}
