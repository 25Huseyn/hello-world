package az.atlacademy.eolymp;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int first=num / 100;
        int last =num % 10;
        if (first > last){
            System.out.println(first);
        } else if (last > first) {
            System.out.println(last);
        } else  {
            System.out.println("=");
        }
    }
}
