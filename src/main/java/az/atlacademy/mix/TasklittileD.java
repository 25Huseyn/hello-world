package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittileD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int nums = scan.nextInt();
            if (nums % 2 != 0) {
                System.out.print(nums + " ");
            }
        }
    }
}
