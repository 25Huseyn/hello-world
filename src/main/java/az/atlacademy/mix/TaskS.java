package az.atlacademy.mix;

import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        double sum = 0;
        int count = 0;
        for (int i = 0; i < h; i++) {
            double nums = scan.nextDouble();
            if (nums < 0) {
                count++;
                sum += nums;
            }
        }
        System.out.printf("%d %.2f", count, sum);
    }
}
