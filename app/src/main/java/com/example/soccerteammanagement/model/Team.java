package com.example.soccerteammanagement.model;

public class Team extends SoccerEntity {

    private String teamName;
    private String country;
    private String league;

    public Team(String name, String teamName, String country, String league) {
        super(name);

        this.teamName = teamName;
        this.country = country;
        this.league = league;
    }

    // Getter and setters


    public String getLeague() {return league;}
    public void setLeague(String league) {this.league = league;}

    public String getTeamName() {return teamName;}
    public void setTeamName(String teamName) {this.teamName = teamName;}

    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}

    @Override
    public String getCategory() {
        return "Team";
    }

    @Override
    public String getSpecificDetail() {
        return "Team Name: " + teamName + " Country: " + country + " League: " + league;
    }

}
