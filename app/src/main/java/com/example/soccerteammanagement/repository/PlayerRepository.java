package com.example.soccerteammanagement.repository;
import com.example.soccerteammanagement.model.Player;
import java.util.ArrayList;
import java.util.List;
public class PlayerRepository implements Repository<Player> {
    private final List<Player> players = new ArrayList<>();

    @Override
    public List<Player> getAll() {
        return players;
    }

    @Override
    public void add(Player player) {
        players.add(player);
    }


    @Override
    public List<Player> filter(java.util.function.Predicate<Player> predicate) {
        List<Player> filteredPlayers = new ArrayList<>();
        for (Player player : players) {
            if (predicate.test(player)) {
                filteredPlayers.add(player);
            }
        }
        return filteredPlayers;
    }

}
