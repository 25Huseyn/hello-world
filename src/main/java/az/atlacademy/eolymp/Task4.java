package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
       int a=num % 10;
       int b= (num/10)%10;
       int c= (num/100);
        System.out.println(a*b*c);
    }
}
