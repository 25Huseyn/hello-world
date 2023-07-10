package az.atlacademy.lesson16_p2;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerApp {
    public static void main(String[] args) {
        Player[] players = {
                new Player(20, "Smith"),
                new Player(15, "Jones"),
                new Player(20, "Jones")
        };
        System.out.println(Arrays.toString(players));
        Arrays.sort(players);
        System.out.println(Arrays.toString(players));

        System.out.println("----------- ");
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new PlayerScoreDescComparator());
        System.out.println(Arrays.toString(players));

        System.out.println("----------- ");
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, new PlayerNameDescComparator());
        System.out.println(Arrays.toString(players));

        System.out.println("----------- ");
        System.out.println(Arrays.toString(players));
        Arrays.sort(players, (player1, player2) -> Integer.compare(player1.getScore(), player2.getScore()));
        System.out.println(Arrays.toString(players));


        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
