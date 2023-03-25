package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double x = scan.nextDouble();
            double y = Math.sqrt(x) + 2 * x + Math.sin(x);
            System.out.printf("%.4f\n", y);
        }
        scan.close();
    }
}