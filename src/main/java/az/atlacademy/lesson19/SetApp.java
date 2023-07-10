package az.atlacademy.lesson19;


import java.util.HashSet;

public class SetApp {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(23);
        nums.add(4);

        System.out.println(nums);
        System.out.println(nums.isEmpty());
        System.out.println(nums.remove(1));
        System.out.println(nums.clone());
        System.out.println(nums.contains(5));
        System.out.println(nums.iterator());
        System.out.println(nums.size());
        HashSet<String> words = new HashSet<>();
        words.add("HI");
        words.add("helo");
        words.add("hello");
        words.add("how");
        System.out.println(words);
        System.out.println(words.spliterator());
    }
}
