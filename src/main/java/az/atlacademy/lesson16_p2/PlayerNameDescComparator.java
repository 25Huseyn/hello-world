package az.atlacademy.lesson16_p2;

import java.util.Comparator;

public class PlayerNameDescComparator implements Comparator<Player> {
    @Override
    public int compare(Player player1, Player player2) {
        return player2.getName().compareTo(player1.getName());
    }
}
