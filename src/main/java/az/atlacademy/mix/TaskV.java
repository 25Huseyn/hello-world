package az.atlacademy.mix;

import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = num % 10;
        int b = num / 10;
        System.out.println((a+b)*(a+b));
    }
}
