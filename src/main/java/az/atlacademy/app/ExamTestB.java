package az.atlacademy.app;

import java.util.Scanner;

public class ExamTestB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scan.nextInt();
        }
        int count = 0;
        for (int i = 1; i < N - 1; i++) {
            int p = nums[i - 1];
            int n = nums[i + 1];
            int c = nums[i];
            if (c > p && c > n){
               count++;
            }
        }
        System.out.println(count);
    }
}
