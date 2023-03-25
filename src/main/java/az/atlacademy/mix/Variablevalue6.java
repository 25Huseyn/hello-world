package az.atlacademy.mix;

import java.util.Scanner;

public class Variablevalue6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        double y = (Math.sqrt(Math.pow(x, 4) + 1) / Math.pow(x, 2)) - Math.sqrt(Math.pow(x, 2) / (Math.pow(x, 2) + 1));
        System.out.printf("%.3f", y);
    }
}