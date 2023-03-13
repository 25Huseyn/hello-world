package az.atlacademy.lesson7;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
