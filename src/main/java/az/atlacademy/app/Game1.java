package az.atlacademy.app;

import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int random = (int) (Math.random() * 101);
            int nums = random;
            int given = scan.nextInt();
            System.out.println("Let the game begin!.");
            System.out.println(nums);
            System.out.println(given);
            if (given < nums) {
                System.out.println("Your number is too small. Please, try again..");
            } else if (given > nums) {
                System.out.println(" Your number is too big. Please, try again..");
            } else if (given == nums){
                System.out.println("Congratulations, name!.");
            }
        }
    }
}
