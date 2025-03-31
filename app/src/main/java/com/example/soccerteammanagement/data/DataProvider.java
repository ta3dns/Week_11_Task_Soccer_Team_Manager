package com.example.soccerteammanagement.data;


import com.example.soccerteammanagement.model.Team;
import com.example.soccerteammanagement.model.Player;
import com.example.soccerteammanagement.model.Match;
import java.util.ArrayList;
import java.util.List;
public class DataProvider {
    public static List<Team> createSampleTeams(){
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("FC Barcelona", "FC Barcelona", "Spain", "La Liga"));
        teams.add(new Team("Manchester United", "Manchester United", "England", "Premier League"));
        teams.add(new Team("Paris Saint-Germain", "Paris Saint-Germain", "France", "Ligue 1"));
        return teams;
    }

    public static List<Player> createSamplePlayers(){
        List<Player> players = new ArrayList<>();
        players.add(new Player("Lionel Messi", "Lionel Messi", "FC Barcelona", "Forward"));
        players.add(new Player("Cristiano Ronaldo", "Cristiano Ronaldo", "Manchester United", "Forward"));
        players.add(new Player("Neymar", "Neymar", "Paris Saint-Germain", "Forward"));
        return players;
    }

    public static List<Match> createSampleMatches(){
        List<Match> matches = new ArrayList<>();
        matches.add(new Match("Match 1", "FC Barcelona", "Manchester United", "3-1"));
        matches.add(new Match("Match 2", "Paris Saint-Germain", "FC Barcelona", "2-2"));
        matches.add(new Match("Match 3", "Manchester United", "Paris Saint-Germain", "1-0"));
        return matches;
    }
}
