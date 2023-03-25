package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextInt();
        double y = Math.pow(x, 3) - 5 * Math.pow(x, 2) / 7 + 9 * x - 3 / x + 1;
        System.out.printf("%.3f", y);
    }
}
