package az.atlacademy.mix;

import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        double[] nums = new double[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextDouble();
        }
        int index;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 2.5) {
                index = i;
                System.out.printf(index + " " + " %.2f"  + nums[i]);
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
