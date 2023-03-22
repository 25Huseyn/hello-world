package az.atlacademy.mix;

import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        double[] nums = new double[length];


        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextDouble();
        }int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 2.5) {
                index = i;
                break;
            }
            if (nums[i] < 2.5) {
                index = i;
                System.out.print(index + " " + "\t %.2f"  + nums[i]);
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
