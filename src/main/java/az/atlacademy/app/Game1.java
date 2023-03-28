package az.atlacademy.app;

import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int random = (int) (Math.random() * 101);
        String name = scan.next();
        System.out.println("Let the game begin!.");
        while (scan.hasNext()) {
            int nums = random;
            int given = scan.nextInt();

            System.out.println(given);
            if (given < nums) {
                System.out.println("Your number is too small. Please, try again..");
            } else if (given > nums) {
                System.out.println(" Your number is too big. Please, try again..");
            } else {
                System.out.println("Congratulations, " + name);
            }
        }
    }
}
