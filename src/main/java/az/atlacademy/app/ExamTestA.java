package az.atlacademy.app;

import java.util.Scanner;

public class ExamTestA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            double salary = scan.nextDouble();
            double max = 0;
           if (max < salary ){
               max = (double) salary;
           }
            System.out.printf("%.2f",max);
        }
    }
}
