package az.atlacademy.lesson14;

import java.time.ZonedDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        while (scan.hasNext()) {
            String word = scan.next();
            try {
                num = Integer.parseInt(word);
                System.out.println(num * 5);
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("again");
            }
        }
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }

}
