package com.example.soccerteammanagement.model;

public class Player extends SoccerEntity {
    private String playerName;
    private String team;
    private String position;

    public Player(String name, String playerName, String team, String position) {
        super(name);
        this.playerName = playerName;
        this.team = team;
        this.position = position;

    }

    // Getters and Setters

    public String getPlayerName() {return playerName;}
    public void setPlayerName(String playerName) {this.playerName = playerName; }

    public String getPosition() {return position;}
    public void setPosition(String position) {this.position = position;}

    public String getTeam() {return team;}
    public void setTeam(String team) {this.team = team;}

    @Override
    public String getCategory() {
        return "Player";
    }

    @Override
    public String getSpecificDetail() {
        return "Player Name: " + playerName + " Team:" + team + " Position: " + position;
    }
}
