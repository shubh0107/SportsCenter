package com.project.xmlModels;


public class Schedule {
	
	String seriesName;
	String matchName;
	String awayTeam, awayTeamId;
	String homeTeam,homeTeamId;
	String venue;
	String city;
	
	public Schedule() {
		super();
	}

	public Schedule(String seriesName, String matchName, String awayTeam, String awayTeamId, String homeTeam,
			String homeTeamId, String venue, String city) {
		super();
		this.seriesName = seriesName;
		this.matchName = matchName;
		this.awayTeam = awayTeam;
		this.awayTeamId = awayTeamId;
		this.homeTeam = homeTeam;
		this.homeTeamId = homeTeamId;
		this.venue = venue;
		this.city = city;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getMatchName() {
		return matchName;
	}

	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public String getAwayTeamId() {
		return awayTeamId;
	}

	public void setAwayTeamId(String awayTeamId) {
		this.awayTeamId = awayTeamId;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getHomeTeamId() {
		return homeTeamId;
	}

	public void setHomeTeamId(String homeTeamId) {
		this.homeTeamId = homeTeamId;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

	
}	