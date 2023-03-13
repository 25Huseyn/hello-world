package az.atlacademy.lesson7;

import java.util.Scanner;

public class Next6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a>=1 && b<=1000){
            System.out.println(2*a +2*b );

        }
    }
}
