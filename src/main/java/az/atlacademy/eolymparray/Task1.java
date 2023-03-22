package az.atlacademy.eolymparray;

import java.util.Scanner;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}
