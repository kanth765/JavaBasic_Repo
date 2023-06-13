package com.ciq.generics;

public class CricketPlayer extends Player {

	private String typeOfPlayer;

	public CricketPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CricketPlayer(int id, String firstName, String lastName, int year ,String typeOfPlayer) {
		super(id, firstName, lastName, year);
		this.typeOfPlayer=typeOfPlayer;
	}
	
	
}
