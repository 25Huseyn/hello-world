package az.atlacademy.app;

import java.util.Scanner;

public class Game1Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[1];

        for (int i = 0; i < 1; i++) {
            int random = (int) (Math.random() * 101);
            nums[i] = random;
        }while (scan.hasNext()){
            int given = scan.nextInt();
            System.out.println(given);
            if (given < nums[0]) {
                System.out.println("Your number is too small. Please, try again..");
            } else if (given > nums[0]) {
                System.out.println(" Your number is too big. Please, try again..");
            } else {
                System.out.println("Congratulations, name!.");
            }
        }
    }
}