package az.atlacademy.mix;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i =0;
        for (int j = 0; j < 4; j++) {
        for (i = 1; i <= n; i++) {
            System.out.print("#");
        }
            System.out.println();
        }
    }
}
