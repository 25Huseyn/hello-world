package az.atlacademy.mix;

import java.util.Scanner;

public class MonthQuarters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if (N<4){
            System.out.println("First");
        } else if (N<7) {
            System.out.println("Second");
        } else if (N<10) {
            System.out.println("Third");
        }else {
            System.out.println("Fourth");
        }
    }
}
