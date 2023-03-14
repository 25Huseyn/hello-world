package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a < b){
            System.out.println(a +" " + b);
        }
        if (b < a){
            System.out.println(b +" " + a);
        }
    }
}
