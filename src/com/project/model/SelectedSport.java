package com.project.model;

public class SelectedSport {
	
	private String email;
	private int cricket;
	private int football;
	private int tennis;
	
	
	public SelectedSport() {
		super();
	}
	
	public SelectedSport(String email, int cricket, int football, int tennis) {
		super();
		this.email = email;
		this.cricket = cricket;
		this.football = football;
		this.tennis = tennis;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCricket() {
		return cricket;
	}

	public void setCricket(int cricket) {
		this.cricket = cricket;
	}

	public int getFootball() {
		return football;
	}

	public void setFootball(int football) {
		this.football = football;
	}

	public int getTennis() {
		return tennis;
	}

	public void setTennis(int tennis) {
		this.tennis = tennis;
	}
	

}
