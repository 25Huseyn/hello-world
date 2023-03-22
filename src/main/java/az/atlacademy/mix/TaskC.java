package az.atlacademy.mix;


import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {

            nums[i] = scan.nextInt();
        }
        for (int num : nums) {
            System.out.println(num);
        }
    }
}

