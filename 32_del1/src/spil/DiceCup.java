package spil;

public class DiceCup {

	private Dice d1;	/** terning 1 */
	private Dice d2;	/** terning 2 */

	private int roundScore; 		/** nuværende sum af antal øjne på de to terninger */
	
	/** default konstruktør, et rafflebæger der indeholder 2 terninger samt summen af de 2 terninger og
	 * om sidste slag var 2 6'ere. */
	public DiceCup() {
		d1 = new Dice();
		d2 = new Dice();
	}

	/** henter slagets point */
	public int getRoundScore() {
		return roundScore;
	}

	/** sætter slagets point */
	public void setRoundScore(int roundScore) {
		this.roundScore = roundScore;
	}

	public int getD1() {
		return d1.getFaceValue();
	}
	
	public int getD2() {
		return d2.getFaceValue();
	}
	
	public int getLastD1() {
		return d1.getLastValue();
	}
	
	public int getLastD2() {
		return d2.getLastValue();
	}
	
	public void throwDice() {
		d1.roll();
		d2.roll();
		setRoundScore(d1.getFaceValue() + d2.getFaceValue());
	}
}
