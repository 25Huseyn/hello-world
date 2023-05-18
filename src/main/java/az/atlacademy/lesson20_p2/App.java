package az.atlacademy.lesson20_p2;

public class App {
    public static void main(String[] args) {
        int[] nums = new int[20];
        int min = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            nums[i] = (int) (Math.random() * 101);
            System.out.print(nums[i] + " - ");
            if (min > nums[i]) {
                min = nums[i];
            }
            if (max < nums[i]) {
                max = nums[i];
            }
            sum += nums[i];
        }
        int average = sum / 20;
        System.out.println(min);
        System.out.println(max);
        System.out.println(average);
    }
}
