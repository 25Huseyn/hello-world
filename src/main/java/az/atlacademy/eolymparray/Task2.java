package az.atlacademy.eolymparray;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] nums = new int[n][n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    nums[i][j] = num;
                    num++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    nums[i][j] = num;
                    num++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
