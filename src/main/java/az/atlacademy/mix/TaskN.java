package az.atlacademy.mix;

import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] nums = new int[length];
        int n = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] % 6 == 0) {
                n++;
                sum += nums[i];
            }
        }
        System.out.println(n + " " + sum);
    }
}
