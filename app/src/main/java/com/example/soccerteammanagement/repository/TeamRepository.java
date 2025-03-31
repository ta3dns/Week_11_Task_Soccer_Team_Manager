package com.example.soccerteammanagement.repository;
import com.example.soccerteammanagement.model.Team;
import java.util.ArrayList;
import java.util.List;
public class TeamRepository implements Repository<Team>{
    private final List<Team> teams = new ArrayList<>();

    @Override
    public List<Team> getAll() {
        return teams;
    }

    @Override
    public void add(Team team) {
        teams.add(team);
    }

    @Override
    public List<Team> filter(java.util.function.Predicate<Team> predicate) {
        List<Team> filteredTeams = new ArrayList<>();
        for (Team team : teams) {
            if (predicate.test(team)) {
                filteredTeams.add(team);
            }
        }
        return filteredTeams;
    }

    public List<Team> filterByLeague(String league) {
        return filter(team -> team.getLeague().equalsIgnoreCase(league));
    }

}
