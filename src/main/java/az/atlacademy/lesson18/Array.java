package az.atlacademy.lesson18;

import java.util.Optional;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int length = scan.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            int random = (int) (Math.random() * 101);
            nums[i] = random;
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
