package az.atlacademy.lesson7;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        System.out.println(count);
    }
}
