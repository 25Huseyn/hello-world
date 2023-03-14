package az.atlacademy.app;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("enter value");
            int num = in.nextInt();
            nums[i] = num;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (nums[i] % 2 == 1) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}