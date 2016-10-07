package spil;

public class Dice {
	
	private final int MAX = 6 ; /** antal sider på terningen. */
	private int faceValue = 1; 	/** nuværende værdi af terningen */
	private int lastValue = 1;

	/** default konstruktør - tildeler tilfældig værdi. */
	public Dice() {}
	
	/** kopi-konstruktør der sætter værdien fra et andet terning objekt. */
	public Dice(Dice t)
	{
		faceValue = t.faceValue;
	}

	/** sætter ternings værdi. Hvis den indtastede værdi ikke er repræsenteret på terningen, kastes terningen
	for ny tilfældig værdi(setter). */
	public void setFaceValue(int value)
	{
		if (value >= 1 && value <= MAX)
		{
			faceValue = value;
		} else this.roll();
	}

	/** henter terningens nuværende værdi(getter). */
	public int getFaceValue()
	{
		return faceValue;
	}
	
	/** sætter værdien af forrige kast */
	public void setLastValue(int value) {
		lastValue = value;
	}
	
	/** henter værdien af forrige kast */
	public int getLastValue() {
		return lastValue;
	}

	/** gemmer forrige kast i variablen lastValue og kaster derefter terningen og returner værdien. */
	public void roll()
	{
		setLastValue(getFaceValue());
		setFaceValue(( int )( Math.random() * MAX ) + 1);
	}

	/** returnerer en streng repræsentation af objektets data. */
	public String toString()
	{
		String result = "øjne: " + faceValue;
		return result;
	}
}
