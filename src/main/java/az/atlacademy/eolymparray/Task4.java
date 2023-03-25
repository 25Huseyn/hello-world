package az.atlacademy.eolymparray;


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double result = min(max(x, y), max(y, z), x + y + z);
        System.out.println(result);

    }

    public static double max(double x, double z) {
        return Math.max(x, z);
    }

    public static double min(double x, double z) {
        return Math.min(x, z);
    }

    public static double min(double x, double y, double z) {
        return min(min(x, y), z);
    }
}