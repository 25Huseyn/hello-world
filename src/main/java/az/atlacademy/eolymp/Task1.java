package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num>0 && num<100){
            int rem=num%10;
            num/=10;
            System.out.println(num + " " + rem);

        }
    }
}
