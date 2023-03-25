package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double x = scan.nextDouble();
            double y = Math.pow(x, 3) + 2 * Math.pow(x, 2) - 3;
            System.out.printf("%.4f\n", y);
        }
        scan.close();
    }
}