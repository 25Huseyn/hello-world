package az.atlacademy.app;

public class Array3 {
    public static void mainV1(String[] args) {
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * i;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] nums = new int[5][5];
        int count = 1;
        for (int row = 0; row < nums.length; row++) {
            int[] currow = nums[0];
            for (int col = 0; col < nums.length; col++) {
                nums[row][col]=count++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " \t");
            }
            System.out.println();
        }
    }
}

