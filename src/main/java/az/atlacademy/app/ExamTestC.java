package az.atlacademy.app;

import java.util.Scanner;

public class ExamTestC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
