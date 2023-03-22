package az.atlacademy.eolymparray;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double max = min(max(x, y), max(y, z), x + y + z);
        System.out.printf("%.2f", max);

    }

    public static double min(double x, double y) {
        return (x < y) ? x : y;
    }

    public static double min(double x, double y, double z) {
        return (min(min(x, y), z));
    }public static double max(double x, double y) {
        return (x > y) ? x : y;
    }
}