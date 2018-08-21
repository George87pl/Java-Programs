package com.company;

public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Drużyna basebalowa");
        baseballPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Drużyna soccerowa");
        Team<SoccerPlayer> soccerPlayerTeam2 = new Team<>("Drużyna soccerowa 2");
        soccerPlayerTeam.addPlayer(beckham);

        soccerPlayerTeam.matchResult(soccerPlayerTeam2, 1, 4);

        System.out.println("Rankings");
        System.out.println(soccerPlayerTeam.getName() + ": " + soccerPlayerTeam.ranking());
        System.out.println(soccerPlayerTeam2.getName() + ": " + soccerPlayerTeam2.ranking());

        System.out.println(soccerPlayerTeam2.compareTo(soccerPlayerTeam));

    }
}
