package az.atlacademy.lesson18_p2;

import java.util.ArrayList;

public class ArrayListApp {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            nums.add((int) (Math.random() * 100));
        }
        System.out.println(nums);

        System.out.println(nums.isEmpty());

        nums.sort(Integer::compareTo);

        System.out.println(nums);

        nums.add(3);
        System.out.println(nums);
        System.out.println(nums.hashCode());
        System.out.println(nums.remove(4));
        nums.clear();
        System.out.println(nums);
        nums.addAll(1, nums);
        System.out.println(nums);
    }
}


