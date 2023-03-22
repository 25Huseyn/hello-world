package az.atlacademy.eolymparray;

import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] nums = new int[n][m];
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = num;
                num++;
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
