package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = 0;
        if (x > 0) {
            y = 1;
        } else if (x < 0) {
            y = -1;
        } else {
            y = 0;
        }
        System.out.println(y);
    }
}
