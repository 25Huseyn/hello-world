package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num <= 3) {
            System.out.println("Initial");
        } else if (num <= 6) {
            System.out.println("Average");
        } else if (num <= 9) {
            System.out.println("Sufficient");
        } else if (num <= 12) {
            System.out.println("High");
        }
    }
}


