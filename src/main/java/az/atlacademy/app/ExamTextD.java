package az.atlacademy.app;

import java.util.Scanner;

public class ExamTextD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        int max = 0;
            int index = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > max) {
                    index = i;
                    max = nums[i];
                }
            }
        System.out.println(max);
        System.out.println(index);
    }
}