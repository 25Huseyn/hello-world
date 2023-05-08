package az.atlacademy.lesson5;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num >= 0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }
    }
}
