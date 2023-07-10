package az.atlacademy.lesson18_p2;

import java.util.ArrayList;

public class ArrayListApp1 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            nums.add((int) (Math.random() * 100));
        }
        System.out.println(nums);
        nums.sort(Integer::compare);
        System.out.println(nums);
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(3);
        nums1.add(45);
        nums1.add(7);
        System.out.println(nums1);
        nums.addAll(2, nums1);
        System.out.println(nums);
        nums.sort(Integer::compareTo);
        System.out.println(nums);
        boolean isThere = nums.contains(7);
        System.out.println(isThere);
        ArrayList<Integer> nums2 = new ArrayList<>(9);
        nums2.add(4);
        nums2.add(23);
        nums2.add(43);
        nums2.add(79);
        nums2.trimToSize();
        System.out.println(nums2);
        nums.ensureCapacity(500);
        nums.equals(nums);
    }
}
