package spil;

public class Rules {
	
	/** tjekker om der er slået to ens */
	public static boolean evalEqual(DiceCup cup) {
		return cup.getD1() == cup.getD2();
	}
	
	public static boolean evalTwoOnes(DiceCup cup) {
		return cup.getD1() == 1 && cup.getD2() == 1;
	}
	
	public static boolean evalTwoSixesInRow(DiceCup cup) {
		return cup.getD1() == 6 && cup.getD2() == 6 && cup.getLastD1() == 6 && cup.getLastD2() == 6;
	}

	public static boolean evalFourty(Player player) {
		return player.getPoints() >= 40;
	}
}
