package az.atlacademy.lesson14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.next();
        String month = scan.next();
        String year = scan.next();
        int day1 = 0;
        int month1 = 0;
        int year1 = 0;
        try {
            LocalDate.parse(day
            );

            LocalDate userBirthDay = LocalDate.of(year1, month1, day1);
            System.out.println(userBirthDay);

        } catch (InputMismatchException | NumberFormatException e) {
            throw e;
        }
    }
}
