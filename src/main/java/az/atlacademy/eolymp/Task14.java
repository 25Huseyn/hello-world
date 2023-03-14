package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = 0;
        if (x < 5) {
            y = x * x - 3 * x + 4;
        } else {
          y = x + 7;
        }
        System.out.println(y);
    }
}
