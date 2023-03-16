package az.atlacademy.eolymparray;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            int random = (int) (Math.random() * 101);
            nums[i] = random;
        }
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " - ");
        }
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println(min);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
}





