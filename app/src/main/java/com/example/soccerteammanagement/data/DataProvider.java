package com.example.soccerteammanagement.data;


import com.example.soccerteammanagement.model.Team;
import com.example.soccerteammanagement.model.Player;
import com.example.soccerteammanagement.model.Match;
import java.util.ArrayList;
import java.util.List;
public class DataProvider {
    public static List<Team> createSampleTeams(){
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("1", "FC Barcelona", "Spain", "La Liga"));
        teams.add(new Team("2", "Manchester United", "England", "Premier League"));
        teams.add(new Team("3", "Paris Saint-Germain", "France", "Ligue 1"));
        return teams;
    }

    public static List<Player> createSamplePlayers(){
        List<Player> players = new ArrayList<>();
        players.add(new Player("1", "Lionel Messi", "FC Barcelona", "Forward"));
        players.add(new Player("2", "Cristiano Ronaldo", "Manchester United", "Forward"));
        players.add(new Player("3", "Neymar", "Paris Saint-Germain", "Forward"));
        return players;
    }

    public static List<Match> createSampleMatches(){
        List<Match> matches = new ArrayList<>();
        matches.add(new Match("1", "FC Barcelona", "Manchester United", "3-1"));
        matches.add(new Match("2", "Paris Saint-Germain", "FC Barcelona", "2-2"));
        matches.add(new Match("3", "Manchester United", "Paris Saint-Germain", "1-0"));
        return matches;
    }
}
