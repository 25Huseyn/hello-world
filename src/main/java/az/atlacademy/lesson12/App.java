package az.atlacademy.lesson12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int num = 0;
           try {
                num = Integer.parseInt(word);
           }
           catch (NumberFormatException numberFormatException){
               System.out.println("NumberFormatException");
           }
            int end = 0;
        while (num > 0) {
            end =  num % 10;
            num /= 10;
        }
        System.out.println( num );
    }
}
