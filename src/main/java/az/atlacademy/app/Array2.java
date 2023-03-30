package az.atlacademy.app;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("enter value");
            int num = in.nextInt();
            nums[i] = num;
        }

    }
}


