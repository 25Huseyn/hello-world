package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = x + Math.sin(x);
        System.out.printf("%.4f", y);
    }
}