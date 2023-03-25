package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (scan.hasNext()) {
            int nums = scan.nextInt();
            sum += nums;
            count++;
        }
        System.out.print(count + " " + sum);
    }
}
