package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        if (n % 2 == 0 && m % 2 == 0 || n % 2 == 1 && m % 2 == 1 ){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
