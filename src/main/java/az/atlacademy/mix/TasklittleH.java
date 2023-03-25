package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            double c = Math.pow(x, 2) + Math.sin(x * y) - Math.pow(y, 2);
            System.out.printf("%.4f\n", c);
        }
        scan.close();
    }
}
