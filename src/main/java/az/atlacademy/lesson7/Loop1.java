package az.atlacademy.lesson7;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int last = num & 10;
        int third = (num / 10) & 10;
        int sec = (num / 100) & 10;
        int first = (num / 1000) & 10;

    }
}
