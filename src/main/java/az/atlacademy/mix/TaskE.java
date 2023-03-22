package az.atlacademy.mix;

import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long s = scan.nextLong();
        long sum = 0;
        long n = 0;
        long yearsmoney = 0;
        while (sum < s){
            n++;
            yearsmoney = n + yearsmoney*2;
            sum += yearsmoney;
        }
        System.out.println(n);
    }
}