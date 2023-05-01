package az.atlacademy;

import java.util.Scanner;

public class lesson14 {
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
    }
}
