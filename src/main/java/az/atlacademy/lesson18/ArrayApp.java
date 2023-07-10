package az.atlacademy.lesson18;

import java.util.Scanner;
import java.util.Optional;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[15];

        for (int i = 0; i < nums.length; i++) {
            int random = (int) (Math.random() * 101);
            nums[i] = random;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " - ");
        }
    }

    public static Optional<Integer> checkArray(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return Optional.of(i);
            }
        }
        return Optional.empty();
    }
}