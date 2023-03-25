package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums = 1;
        while (nums * nums <= n) {
            System.out.print(nums * nums + " ");
            nums++;
        }
    }
}
