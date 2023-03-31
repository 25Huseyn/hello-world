package az.atlacademy.app;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit = scan.nextInt();
        nums(digit);
    }

     static int nums(int digit) {

        while (digit > 0) {
            int last = digit % 10;
            digit /= 10;
            System.out.print(last + " ");
        }
         return digit;
     }
}
