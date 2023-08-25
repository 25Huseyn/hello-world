package az.atlacademy.lesson12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String word1 = scan.next();
        int num = 0;
        int num1 = 0;
        try {
            num = Integer.parseInt(word);
            num1 = Integer.parseInt(word1);
            System.out.println(num / num1);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e);
        }
    }
}
