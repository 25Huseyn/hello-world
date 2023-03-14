package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0){
            System.out.println("EVEN");
        } else if (num % 2 == 1) {
            System.out.println("ODD");
        }
    }
}
