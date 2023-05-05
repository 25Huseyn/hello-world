package az.atlacademy.lesson16;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
         int[] nums={0,2,1,5,-4};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] words = {"A","T","L","K","G"};
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
