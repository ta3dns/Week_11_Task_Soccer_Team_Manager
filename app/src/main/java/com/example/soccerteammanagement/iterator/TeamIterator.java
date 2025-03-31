package com.example.soccerteammanagement.iterator;

import com.example.soccerteammanagement.model.Team;
import java.util.List;
public class TeamIterator implements CustomerIterator<Team>{
    private final List<Team> teams;
    private int index = 0;

    public TeamIterator(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public boolean hasNext() {
        return index < teams.size();
    }

    @Override
    public Team next() {
        return teams.get(index++);
    }
}
