package com.app.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="cricket_matches")

public class Match {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int matchId;
	
	private String teamHeading;
	
	private String matchNumberVenue;
	
	private String battingTeam;
	
	private String battingTeamScore;
	
	private String bowlingTeam;
	
	private String bowlingTeamScore;
	
	private String liveText;
	
	private String matchLink;
	
	private String textComplete;
	
	@Enumerated
	private MatchStatus status;
	
	private Date date;
	
	

	//private Date date = new Date();

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getTeamHeading() {
		return teamHeading;
	}

	public void setTeamHeading(String teamHeading) {
		this.teamHeading = teamHeading;
	}

	public String getMatchNumberVenue() {
		return matchNumberVenue;
	}

	public void setMatchNumberVenue(String matchNumberVenue) {
		this.matchNumberVenue = matchNumberVenue;
	}

	public String getBattingTeam() {
		return battingTeam;
	}

	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}

	public String getBattingTeamScore() {
		return battingTeamScore;
	}

	public void setBattingTeamScore(String battingTeamScore) {
		this.battingTeamScore = battingTeamScore;
	}

	public String getBowlingTeam() {
		return bowlingTeam;
	}

	public void setBowlingTeam(String bowlingTeam) {
		this.bowlingTeam = bowlingTeam;
	}

	public String getBowlingTeamScore() {
		return bowlingTeamScore;
	}

	public void setBowlingTeamScore(String bowlingTeamScore) {
		this.bowlingTeamScore = bowlingTeamScore;
	}

	public String getLiveText() {
		return liveText;
	}

	public void setLiveText(String liveText) {
		this.liveText = liveText;
	}

	public String getMatchLink() {
		return matchLink;
	}

	public void setMatchLink(String matchLink) {
		this.matchLink = matchLink;
	}

	public String getTextComplete() {
		return textComplete;
	}

	public void setTextComplete(String textComplete) {
		this.textComplete = textComplete;
	}

	public MatchStatus getStatus() {
		return status;
	}

	public void setStatus(MatchStatus status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	// setting match status as per text completr
	
	public void setMatchStatus() {
		if(textComplete.isBlank()) {
			this.setStatus(MatchStatus.LIVE); ;
		}
		else {
			this.setStatus(MatchStatus.COMPLETED);
		}
	}
}
