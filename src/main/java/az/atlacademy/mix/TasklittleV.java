package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long k = scan.nextLong();
        long n = 0;
        for (int i = 1; i < k; i++) {
            n += i;
            if (n % k == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}