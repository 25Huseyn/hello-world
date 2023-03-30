package az.atlacademy.app;

import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        char[][] table =new  char [5][5];
        final int row =(int) (Math.random() * 5);
        final int col =(int) (Math.random() * 5);
        System.err.println(row + " - " + col);
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
              table[i][j] = '-' ;
            }
        }
        System.out.println("All set. Get ready to rumble!");
        Scanner scan = new Scanner(System.in);
        int guessedrow;
        int guessedcolumn;
             while (true){
               guessedrow = scan.nextInt() - 1;
                 guessedcolumn = scan.nextInt() - 1;
               if (guessedcolumn == col && guessedrow == row){
                   table[guessedrow][guessedcolumn]= 'x';
                   printTable(table);
                   System.out.println("You have won!");
                   break;
               }else {
                      table[guessedrow][guessedcolumn]= '*';
                   printTable(table);
               }
             }
    }

    private static void printTable(char[][] table) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " | " );
            for (int j = 0; j < 5; j++) {
                System.out.print(table[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
