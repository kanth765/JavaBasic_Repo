package com.ciq.generics;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {

	private List<T> players = new ArrayList<>();

	public void add(T e) {
		players.add(e);
	}

	public List<T> getAllPlayers() {
		return players;

	}

	public static void main(String[] args) {

		Team<CricketPlayer> team1 = new Team<>();

		CricketPlayer c1 = new CricketPlayer(1, "sachin", "ten", 1969, "All rounder");
		CricketPlayer c2 = new CricketPlayer(2, "sachin", "ten", 1969, "All rounder");
		CricketPlayer c3 = new CricketPlayer(3, "sachin", "ten", 1969, "All rounder");

		FootballPlayer f1 = new FootballPlayer(1, "cristiano", "Ronaldo", 1980, "forward palyer");
		FootballPlayer f2 = new FootballPlayer(2, "cristiano", "Ronaldo", 1980, "forward palyer");
		FootballPlayer f3 = new FootballPlayer(3, "cristiano", "Ronaldo", 1980, "forward palyer");
//		team1.add(f3);
		team1.add(c1);

		List<CricketPlayer> allPlayers = team1.getAllPlayers();
		allPlayers.forEach(System.out::println);

//		Team<String> team2 = new Team();

//		Team<Boolean> team3 = new Team();
	}
}
