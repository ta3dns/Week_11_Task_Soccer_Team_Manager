package com.example.soccerteammanagement.repository;
import com.example.soccerteammanagement.model.Match;
import java.util.ArrayList;
import java.util.List;
public class MatchRepository implements Repository<Match>{
    private final List<Match> matches = new ArrayList<>();

    @Override
    public List<Match> getAll() {
        return matches;
    }

    @Override
    public void add(Match match) {
        matches.add(match);
    }

    @Override
    public List<Match> filter(java.util.function.Predicate<Match> predicate) {
        List<Match> filteredMatches = new ArrayList<>();
        for (Match match : matches) {
            if (predicate.test(match)) {
                filteredMatches.add(match);
            }
        }
        return filteredMatches;
    }
    public List<Match> filterByTeam(String team) {
        return filter(match -> match.getHomeTeam().equalsIgnoreCase(team) || match.getAwayTeam().equalsIgnoreCase(team));
    }
}

