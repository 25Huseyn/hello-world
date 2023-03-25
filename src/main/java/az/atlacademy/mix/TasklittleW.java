package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
       int n = scan.nextInt();
        System.out.println((long) Math.pow(a, n));
    }
}