package az.atlacademy.mix;

import java.util.Scanner;

public class OppositeSequenceofNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long k = scan.nextLong();
        do {
            long last = (long) k % 10;
            k /= 10;
            System.out.print(last);
        }
        while (k > 0);
    }
}
