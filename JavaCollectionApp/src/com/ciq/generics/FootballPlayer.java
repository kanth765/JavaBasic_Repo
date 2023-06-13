package com.ciq.generics;

public class FootballPlayer extends Player {

	private String playerPosition;

	public FootballPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FootballPlayer(int id, String firstName, String lastName, int year, String playerPosition) {
		super(id, firstName, lastName, year);
		this.playerPosition=playerPosition;
	}

}
