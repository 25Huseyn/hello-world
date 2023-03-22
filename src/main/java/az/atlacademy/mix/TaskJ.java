package az.atlacademy.mix;

import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            if (a >= 0){
                a+=2;
                System.out.print(a + " ");
            }else {
                System.out.print(a + " ");
            }
        }
    }
}
