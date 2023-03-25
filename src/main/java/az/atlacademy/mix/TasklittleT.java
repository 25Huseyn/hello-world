package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        long fx = 1 + x + (long) x * x;
        System.out.println(fx);
    }
}
