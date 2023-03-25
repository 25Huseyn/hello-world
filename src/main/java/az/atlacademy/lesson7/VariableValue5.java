package az.atlacademy.lesson7;

import java.util.Scanner;

public class VariableValue5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = 2 * x / Math.sqrt(Math.pow(x, 2) + 1) - Math.sqrt(Math.pow(x, 2) + 1) / Math.pow(x, 3);
        System.out.printf("%.3f", y);
    }
}
