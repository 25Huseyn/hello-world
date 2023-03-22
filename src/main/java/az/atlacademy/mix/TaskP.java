package az.atlacademy.mix;

import java.util.Scanner;

public class TaskP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double max = 0;
        for (int i = 0; i < n; i++) {
            double nums = scan.nextDouble();
            if (max < Math.abs(nums)) {
                max = Math.abs(nums);
            }
        }
        System.out.printf("%.2f", max);
    }
}
