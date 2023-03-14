package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > -10 && n < 10) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }
    }
}
