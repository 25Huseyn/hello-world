package az.atlacademy.mix;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n % 10);
    }
}
