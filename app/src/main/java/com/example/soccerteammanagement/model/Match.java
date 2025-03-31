package com.example.soccerteammanagement.model;

public class Match extends SoccerEntity {

    private String homeTeam;
    private String awayTeam;
    private String score;

    public Match(String name, String homeTeam, String awayTeam, String score) {
        super(name);
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = score;
    }

    // Getters and Setters


    public String getHomeTeam() {return homeTeam;}

    public void setHomeTeam(String homeTeam) {this.homeTeam = homeTeam;}

    public String getAwayTeam() {return awayTeam;}
    public void setAwayTeam(String awayTeam) {this.awayTeam = awayTeam;}

    public String getScore() {return score;}
    public void setScore(String score) {this.score = score;}

    @Override
    public String getCategory() {
        return "Match";
    }

    @Override
    public String getSpecificDetail() {
        return "Home Team: " + homeTeam + " Away Team: " + awayTeam + " Score: " + score;
    }
}
