package spil;

public class Player {
	
	private int points = 0;
	private String name;
	
	public Player() {}
	
	/** Hent spillerens point */
	public int getPoints() {
		return points;
	}
	
	/** Sæt spillerens points */
	public void setPoints(int points) {
		this.points = points;
	}
	
	/** Tilføj point til spilleren */
	public void addPoints(int points) {
		this.points = this.points + points;
	}
	
	/** Hent spillerens navn */
	public String getName() {
		return name;
	}
	
	/** Sæt spillerens navn */
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + " har nu " + points + " points.\n";
	}
}
