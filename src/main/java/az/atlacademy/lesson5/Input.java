package az.atlacademy.lesson5;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        System.out.printf(" %.5f", num);
    }
}
