package sportsmanegement;

public class Player {
	
	String playername;
	String sport;
	String status;
	public Player(String playername, String sport, String status) {
		this.playername = playername;
		this.sport = sport;
		this.status = status;
		
	}
	
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Player [playername=" + playername + ", sport=" + sport + ", status=" + status + "]";
	}
}
