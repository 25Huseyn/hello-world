package az.atlacademy.mix;

import java.util.Arrays;
import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            double num = in.nextDouble();
            if (num > 0) {
                sum += num;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Not Found");
        } else {
            System.out.printf("%.2f", (sum / count));
        }
    }
}
