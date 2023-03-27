package az.atlacademy.mix;

import java.util.Scanner;

public class OppositeSequenceofNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long k = scan.nextLong();
        while (k > 0) {
            int last = (int) (k % 10);
            k = k / 10;
            System.out.print(last);
        }
    }
}
