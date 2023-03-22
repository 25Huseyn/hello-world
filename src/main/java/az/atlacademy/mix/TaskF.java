package az.atlacademy.mix;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int num = scan.nextInt();
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                n++;
            } else {
                num += 1;
                n++;
            }
        }
        System.out.println(n);
    }
}
