package az.atlacademy.lesson16_p2;

import java.util.Comparator;

public class PlayerScoreDescComparator implements Comparator<Player> {
    @Override
    public int compare(Player player1, Player player2) {
        return Integer.compare(player2.getScore(),player1.getScore()) ;
    }
}
