package az.atlacademy.leetcode;

import java.util.HashSet;
public class TaskApp {
    public static void main(String[] args) {

        int[] nums = {7, 8, 9, 10, 11, 12};
        int smallNumber = findMissNumber(nums);
        System.out.println(smallNumber);
    }
    public static int findMissNumber(int[] nums) {
        HashSet<Integer> findMissNumberSet = new HashSet<>();

        for (int num : nums) {
            findMissNumberSet.add(num);
        }
        int smallNumber = 1;
        while (findMissNumberSet.contains(smallNumber)) {
            smallNumber++;
        }
        return smallNumber;
    }
}
