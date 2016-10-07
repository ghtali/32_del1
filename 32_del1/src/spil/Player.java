package spil;

public class Player {
	
	private int points = 0;
	private String name;
	
	public Player() {}
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public void addPoints(int points) {
		this.points = this.points + points;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + " har nu " + points + " points.\n";
	}
}
