package az.atlacademy.mix;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        for (int j = 0; j < n; j++) {
            for (int i = 1; i <= m; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
