package az.atlacademy.mix;

import java.util.Scanner;

public class TasklittleV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int sum=0;
        int n = 1;
        for (int i = 1; i <=k; i++) {
            sum +=i;
            if (k % sum==0){
                System.out.println(n);
            }
        }
    }
}