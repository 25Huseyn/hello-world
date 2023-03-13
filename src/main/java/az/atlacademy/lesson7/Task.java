package az.atlacademy.lesson7;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        while (num > 0) {
            if (num < 0) {
                System.out.println(num);
            } else {
                System.out.println(num);
                int rem = num % 10;
                num /= 10;

                System.out.println(rem);
            }
        }
    }
}
