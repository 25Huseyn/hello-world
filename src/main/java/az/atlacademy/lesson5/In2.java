package az.atlacademy.lesson5;


import java.util.Scanner;

public class In2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        System.out.println(word);
        System.out.println(word.length());
        System.out.println(word.toLowerCase());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(word.length() - 1));


    }
}
